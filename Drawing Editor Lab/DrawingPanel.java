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
import java.awt.Dimension;

/**
 * Sets and updates the color of the shapes, determines the size of the canvas on which the shapes are drawn, 
 * contains the methods to add the circles and squares when the correlating button is pressed in the ControlPanel,
 * contians the paintComponent method and has two sub-classes (ClickListener and DragListener) which keep track of
 * when a shape is clicked and becomes the active shape and when a shape is moved around
 * 
 * Alex Arnold 
 * 
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
    private ClickListener listener;
    private DragListener drag;
    private double panelWidth;
    private double panelHeight;
    private Dimension panelSize;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel(DrawingPanel panel)
    {
        super();
        
        this.panelWidth = 400; //setting the dimensions of the JPanel to be used in getPrefferedSize()
        this.panelHeight = 400;
        this.panelSize = new Dimension();
        
        this.setBackground(Color.white); //setting the color of the canvas
        this.shapes = new ArrayList<Shape>();
        this.canvas = panel;
        this.currentColor = Color.red; 
        this.center = new Point2D.Double(getPrefferedSize().getWidth()/2, getPrefferedSize().getHeight()/2); //center of all shapes is in the CENTER of the canvas, hence the n/2
        
        listener = new ClickListener(); //implement the listener
        this.addMouseListener(listener);

        this.drag = new DragListener(); //implement the listener
        this.addMouseMotionListener(drag);
    }

    /**
     * returns the current color as chosen by the user or designated at the start of the program
     */
    public Color getColor()
    {
        return currentColor;
    }
    
    /**
     * returns the dimensions of the panel
     */
    public Dimension getPrefferedSize()
    {
        this.panelSize.setSize(panelWidth, panelHeight);
        return panelSize;
    }   

    /**
     * sets the current color to the chosen color as chosen by the user
     */
    public void pickColor() 
    {
        currentColor = JColorChooser.showDialog(canvas, "Pick a Color", currentColor);
    }

    /**
     * creates a new Circle object and adds it to the shapes ArrayList
     */
    public void addCircle()
    {
        selectedShape = new Circle(center, 50, currentColor);
        shapes.add(selectedShape);
        repaint();
    }

    /**
     * creates a new Square object and adds it to the shapes ArrayList
     */
    public void addSquare()
    {
        selectedShape = new Square(center, 50, currentColor);
        shapes.add(selectedShape);
        repaint();
    }

    /**
     * responsible for drawing the shapes after indicating whether or not a shape was selected.
     *      If a shape was selected, all other shapes are drawn with the boolean filled parameter as true, while the chosen shape's boolean filled parameter is false
     *      If no shape was selected, all shapes in the shapes ArrayList are drawn with their boolean filled parameter as true
     */
    public void paintComponent(Graphics g)
    {
        // put your code here
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        if (this.isShapePicked) //boolean variable updated in the ClickListener class depending on where the mouse was clicked relative to a shape's center
        {
            Shape newShape = this.shapes.get(activeShape);
            this.shapes.remove(activeShape); //removing activeShape from ArrayList so that it is re-drawn as a filled shape
            for (int i = 0; i < this.shapes.size(); i++)
            {
                this.shapes.get(i).draw(g2, true);
            }
            newShape.draw(g2, false); //re-drawing the activeShape as an outline only and then adding it back to the shapes ArrayList
            this.shapes.add(selectedShape);
        }
        else
        {
            for (int i = 0; i < this.shapes.size(); i++)
            {
                this.shapes.get(i).draw(g2, true); //re-drawing all shapes in the ArrayList
            }
        }
    }
    
    public class ClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e)
        {
            Point2D.Double pointClicked = new Point2D.Double(e.getX(), e.getY()); //where user clicked with the mouse
            int i = shapes.size() - 1; //want to be able to iterate through shapes ArrayList backwards in while loop
            isShapePicked = false; 
            while (isShapePicked == false && i >= 0)
            {
                if (shapes.get(i).isInside(pointClicked)) //designating activeShape as the current index if pointClicked is within a radius distance from the center of the shape and settingisShapePicked to true
                {
                    activeShape = i;
                    isShapePicked = true;
                }
                else
                {
                    i--; //need to work through the loop backwards
                    activeShape = -1; 
                }
            }
            repaint();
        }
        public void mouseReleased(MouseEvent e){}
    }
    
    public class DragListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {
            Point2D.Double mousePos = new Point2D.Double(e.getX(), e.getY()); //where the mouse currently is
            listener.mousePressed(e);
            if (isShapePicked)
            {
                shapes.get(shapes.size() - 1).move(e.getX(), e.getY()); //moving the shape to specified location using the move() method from the Shape Class
            }
            repaint();
        }
        public void mouseMoved(MouseEvent e){}
    }
}
