/***************
Homework #4
Due Date: 3/25/2019
Names: Vincent Tramonte, Vincent Rettke
********************/

package assignment4;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author vince
 */
public class Assignment4 extends JFrame
{
    private int mouseX = 0;
    private int mouseY = 0;

    private Color skyColor = new Color(0, 255, 255);
    private Color green = new Color(0, 255, 0);
    private Color mountainColor1 = new Color(0x95, 0x2e, 0x8f); // warm purple 
    private Color mountainColor2 = new Color(0, 0, 0); // black
    private Color yellow = new Color(0xff, 0xff, 0x14);  // yellow
    
    Assignment4()
    {
        setTitle("Motion Parallax");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setResizable(false);

        //Add the Mouse and MouseMotion Listeners
        addMouseListener(new MyMouseListener());
        //addMouseMotionListener(new MyMouseMotionListener());

        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
      // Call the superclass's paint method.
      super.paint(g);
      
      g.setColor(skyColor);             // set sky Color
      g.fillRect(0, 0, 1000, 350);      // create sky
      
      g.setColor(green);                // set grass color
      g.fillRect(0, 350, 1000, 150);    // create grass
      
      g.setColor(mountainColor1);        // color purple mountain
      int x[] = {200, 25, 375};         
      int y[] = {75, 350, 350};
      int npoints = 3;
      g.fillPolygon(x, y, npoints);     // create left mountain
      
      g.setColor(mountainColor2);                // color black mountain
      int x1[] = {375, 225, 525};         
      int y1[] = {125, 350, 350};
      int npoints1 = 3;
      g.fillPolygon(x1, y1, npoints1);  // create right mountain
      
      g.setColor(yellow);               // create sun
      g.fillOval(750, 100, 100, 100);
      
      
    }
    
    private class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
           mountainColor1 = new Color(0, 0, 0);
           mountainColor2 = new Color (0x95, 0x2e, 0x8f);
           repaint();
           
           // might want to write code to change colors back
        }
        
        public void mousePressed(MouseEvent e)
        {

        }

        public void mouseReleased(MouseEvent e)
        {
        }

        public void mouseEntered(MouseEvent e)
        {
        }

        public void mouseExited(MouseEvent e)
        {
        }
        
        
    }
    
    public static void main(String[] args) 
    {
       new Assignment4();
       
    }
    
}

