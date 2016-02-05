import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */


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
       
        editor.setSize(500, 500);
        editor.setVisible(true);

    }

}
