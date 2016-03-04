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
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;

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
    private Shape selectedShape;
    private Color currentColor;
    private DrawingPanel canvas;
    private Point2D.Double center;
    private int activeShape;
    private boolean isShapePicked;
    //private Ellipse2D.Double circle;
    //private Rectangle2D.Double rectangle;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel(DrawingPanel panel)
    {
        // initialise instance variables
        super();
        
        this.setBackground(Color.white);
        this.shapes = new ArrayList<Shape>();
        this.canvas = panel;
        this.currentColor = Color.red;
        this.center = new Point2D.Double(250, 250);
        //this.activeShape = 0;
        //this.circle = new Ellipse2D.Double(0, 0, 0, 0);
        //this.rectangle = new Rectangle2D.Double(0, 0, 0, 0);
        
        MouseListen listener = new MouseListen();
        this.addMouseListener(listener);
    }

    public Color getColor()
    {
        return currentColor;
    }
    
    //public Dimension getPrefferedSize();

    public void pickColor() 
    {
        currentColor = JColorChooser.showDialog(canvas, "Pick a Color", currentColor);
        System.out.println("You succesfully called pickColor method from DrawingPanel");
    }

    public void addCircle()
    {
        selectedShape = new Circle(center, 40, currentColor);
        shapes.add(selectedShape);
        repaint();
        System.out.println("You succesfully called addCircle method from DrawingPanel");
    }

    public void addSquare()
    {
        selectedShape = new Square(center, 40, currentColor);
        shapes.add(selectedShape);
        repaint();
        System.out.println("You succesfully called addSquare method from DrawingPanel");
    }

    public void paintComponent(Graphics g)
    {
        // put your code here
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        if (this.isShapePicked)
        {
            Shape newShape = this.shapes.get(activeShape);
            this.shapes.remove(activeShape);
            for (int i = 0; i < this.shapes.size(); i++)
            {
                this.shapes.get(i).draw(g2, true);
            }
            newShape.draw(g2, false);
            this.shapes.add(selectedShape);
        }
        else
        {
            for (int i = 0; i < this.shapes.size(); i++)
            {
                this.shapes.get(i).draw(g2, true);
            }
        }
        for (Shape shape:shapes)
        {
            shape.draw(g2, true);
        }
    }
    
    public class MouseListen implements MouseListener
    {
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e)
        {
            Point2D.Double pointClicked = new Point2D.Double(e.getX(), e.getY());
            int i = shapes.size() - 1;
            isShapePicked = false; 
            while (isShapePicked == false && i > 0)
            {
                if (shapes.get(i).isInside(pointClicked))
                {
                    activeShape = i;
                    isShapePicked = true;
                    System.out.println("You selected a shape");
                }
                else
                {
                    i--;
                    activeShape = -1;
                    System.out.println("You didn't select a shape");
                }
            }
            repaint();
        }
        public void mouseReleased(MouseEvent e){}
    }
}
