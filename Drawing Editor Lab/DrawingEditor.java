import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.geom.Point2D;

/**
 * Combines DrawingPanel and ControlPanel Classes into one frame where it is presented to user in a GUI
 * 
 * Alex Arnold 
 * 2/8/16
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 1000;     //sets width for the drawing editor
    private static final int FRAME_HEIGHT = 1000;    //sets height for the drawing editor
    
    private ControlPanel control;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        super("Drawing Editor"); //calling the superclass and using it to set the title of the DrawingEditor
        this.canvas = new DrawingPanel(canvas);
        this.control = new ControlPanel(canvas);

        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER); //setting DrawingPanel object to the center of the JFrame
        this.add(control, BorderLayout.SOUTH); //setting the ControlPanle object to the bottom of the JFrame
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        DrawingEditor editor = new DrawingEditor();
    }

}
