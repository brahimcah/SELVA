import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class mainClass extends GraphicsProgram {

    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    public static final int REFRESH = 50;

    //Indiquem quin volem que sigui el noste fons de pantalla
    public void Background (){


        GImage background = new GImage("../resources/background.jpg");
        background.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        add(background);

    }



    public void run() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Background();
        addMouseListeners();
        addKeyListeners();
        GRect rect1 =  new GRect(30,30);
        rect1.setLocation(300,300);
        rect1.setColor(Color.BLUE);
        GRect rect2 =  new GRect(10,10);
        rect2.setLocation(100,100);
        rect2.setColor(Color.RED);
        rect2.setFilled(true);
        add(rect2);
        add(rect1);

        while(true){
            rect2.setLocation(rect2.getLocation().getX() + 10, rect2.getLocation().getY());
            pause(REFRESH);
        }
    }
}
