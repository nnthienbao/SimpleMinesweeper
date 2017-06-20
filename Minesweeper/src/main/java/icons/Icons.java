package icons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by nnthienbao on 20/06/2017.
 */
public class Icons {

    private static Image num1;
    private static Image num2;
    private static Image num3;
    private static Image num4;
    private static Image num5;
    private static Image num6;
    private static Image num7;
    private static Image num8;

    private static Image mine;
    private static Image mineRed;

    private static Image flag;

    private static Image timer;

    public static void loadIcon() throws IOException, URISyntaxException {
        num1 = ImageIO.read(new File(Icons.class.getResource("/images/1.png").toURI()));
        num2 = ImageIO.read(new File(Icons.class.getResource("/images/2.png").toURI()));
        num3 = ImageIO.read(new File(Icons.class.getResource("/images/3.png").toURI()));
        num4 = ImageIO.read(new File(Icons.class.getResource("/images/4.png").toURI()));
        num5 = ImageIO.read(new File(Icons.class.getResource("/images/5.png").toURI()));
        num6 = ImageIO.read(new File(Icons.class.getResource("/images/6.png").toURI()));
        num7 = ImageIO.read(new File(Icons.class.getResource("/images/7.png").toURI()));
        num8 = ImageIO.read(new File(Icons.class.getResource("/images/8.png").toURI()));

        mine = ImageIO.read(new File(Icons.class.getResource("/images/mine.png").toURI()));
        mineRed = ImageIO.read(new File(Icons.class.getResource("/images/mine_red.png").toURI()));

        flag = ImageIO.read(new File(Icons.class.getResource("/images/flag.png").toURI()));

        timer = ImageIO.read(new File(Icons.class.getResource("/images/timer.png").toURI()));
    }

    public static Image[] getArrayNum() {
        Image[] nums = {num1, num2, num3, num4, num5, num6, num7, num8};
        return nums;
    }

    public static Image getMineIcon() {
        return mine;
    }
    public static Image getMineRedIcon() {return mineRed;}

    public static Image getFlagIcon() {
        return flag;
    }

    public static Image getTimerIcon() {return timer;}

}
