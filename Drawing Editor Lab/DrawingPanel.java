import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private ArrayList<Shape> shapes;
    private Shape activeShape;
    private Color startColor;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel(DrawingPanel panel)
    {
        // initialise instance variables
        this.setBackground(Color.white);
        this.shapes = new ArrayList<Shape>();
        this.canvas = panel;
    }

    public void getColor()
    {
        // put your code here
    }

    public void pickColor() 
    {
        JColorChooser.showDialog(canvas, "Pick a Color", Color.yellow);
        System.out.println("You succesfully called pickColor method from DrawingPanel");
    }

    public void addCircle()
    {
        System.out.println("You succesfully called addCircle method from DrawingPanel");
    }

    public void addSquare()
    {
       System.out.println("You succesfully called addSquare method from DrawingPanel");
    }

    public void paintComponent(Graphics g)
    {
        // put your code here
        super.paintComponent(g);
    }
    
    public class MouseListen implements MouseListener
    {
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
    }


}
