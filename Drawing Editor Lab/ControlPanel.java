import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton pickColor;
    private JPanel currentColor;
    private JButton addCircle;
    private JButton addSquare;
    private DrawingPanel canvas;
    

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel panel)
    {
        // initialise instance variables
        this.canvas = panel;
        
        this.pickColor = new JButton("Pick Color");
        this.add(this.pickColor);
        
        this.currentColor = new JPanel();
        currentColor.setBackground(canvas.getColor());
        this.add(this.currentColor);
        
        this.addCircle = new JButton("Add Circle");
        this.add(this.addCircle);
        
        this.addSquare = new JButton("Add Square");
        this.add(this.addSquare);
        
        ClickListener listener = new ClickListener(); 
        this.pickColor.addActionListener(listener); 
        this.addCircle.addActionListener(listener);
        this.addSquare.addActionListener(listener);
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Button " + event.getActionCommand() + " was clicked!");
            
            if (event.getActionCommand().equals("Pick Color"))
            {
                canvas.pickColor();
            }
            else if (event.getActionCommand().equals("Add Circle"))
            {
                canvas.addCircle();
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                canvas.addSquare();
            }
        }
    }
    

}
