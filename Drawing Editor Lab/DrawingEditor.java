import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Write a description of class DrawingEditor here.
 * 
 * Alex Arnold 
 * 2/8/16
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 500;     //sets width for the drawing editor
    private static final int FRAME_HEIGHT = 500;    //sets height for the drawing editor

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        // initialise instance variables
        super("Drawing Editor");
        this.setLayout(new BorderLayout());
        //this.add(canvas, BorderLayout.CENTER);
        //this.add(controls, BorderLayout.SOUTH);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args) 
    {
        // put your code here
        DrawingEditor editor = new DrawingEditor();
       
        editor.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editor.setVisible(true);

    }

}
