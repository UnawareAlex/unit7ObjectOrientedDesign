import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
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
    private Color currentColor;
    private DrawingPanel canvas;
    
    private Ellipse2D.Double circle;
    private Rectangle2D.Double rectangle;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel(DrawingPanel panel)
    {
        // initialise instance variables
        this.setBackground(Color.white);
        this.shapes = new ArrayList<Shape>();
        this.canvas = panel;
        this.currentColor = Color.yellow;
        this.circle = new Ellipse2D.Double(0, 0, 0, 0);
        this.rectangle = new Rectangle2D.Double(0, 0, 0, 0);
    }

    public Color getColor()
    {
        return currentColor;
    }

    public void pickColor() 
    {
        currentColor = JColorChooser.showDialog(canvas, "Pick a Color", currentColor);
        System.out.println("You succesfully called pickColor method from DrawingPanel");
    }

    public void addCircle()
    {
        circle.setFrame(250, 250, 20, 20);
        repaint();
        System.out.println("You succesfully called addCircle method from DrawingPanel");
    }

    public void addSquare()
    {
        rectangle.setFrame(250, 250, 40, 30);
        repaint();
        System.out.println("You succesfully called addSquare method from DrawingPanel");
    }

    public void paintComponent(Graphics g)
    {
        // put your code here
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(currentColor);
        g2.draw(circle);
        g2.draw(rectangle);
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
