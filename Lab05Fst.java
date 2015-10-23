// Lab05Fst.java
// This is the student, starting version of Lab 05F which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class Lab05Fst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        int x1, y1, x2, y2, x, y, r, d;

        // Draw Red Horizontal Lines
        Expo.setColor(g,Expo.red);
        x1 = 0;
        y1 = 5;
        x2 = 250;
        y2 = 5;
        for (int j = 1; j <= 32; j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y1 += 10;
            y2 += 10;
        }


        // Draw Blue Vertical Lines
        Expo.setColor(g,Expo.blue);
        x1 = 255;
        y1 = 0;
        x2 = 255;
        y2 = 325;
        for (int j = 1; j <= 25; j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            x1 += 10;
            x2 += 10;
        }





        // Draw Gray Diagonal Dots
        Expo.setColor(g,Expo.gray);
        x1 = 515;
        y1 = 275;
        x2 = 300;
        y2 = 275;
        for (int j = 1; j <= 23; j++)
        {
            Expo.drawPoint(g,x1,y1);
            y1 -= 10;
            x1 += 10;
        }





        // Draw Green Concentric Circles
        Expo.setColor(g,Expo.green);
        x1 = 875;    
        y1 = 163;
        r = 15; //radius
        for (int j = 1; j <= 15; j++)
        {
            Expo.drawCircle (g,x1,y1,r);
            r += 7;
        }
            





        // Draw Purple Concentric Ovals
        Expo.setColor(g,Expo.purple);
        x1 = 125;    
        y1 = 500;
        r = 5; //horizontal
        d = 11; //vertical
        for (int j = 1; j <= 23; j++)
        {
            Expo.drawOval (g,x1,y1,r,d);
            r += 5;
            d += 7;
        }




        // Draw Pink Concentric Arcs
        Expo.setColor(g,Expo.pink);





        // Draw Brown Concentric Rectangles
        Expo.setColor(g,Expo.brown);





        // Draw Gold Sphere
        Expo.setColor(g,Expo.gold);





    }
}




