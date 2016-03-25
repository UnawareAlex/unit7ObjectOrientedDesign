import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Holds the 'Pick Color', 'Add Circle' and 'Add Square' buttons as well as the current color
 * indicator panel, which use the ClickListener to implement methods from the DrawingPanel Class
 * 
 * Alex Arnold
 * 
 */
public class ControlPanel extends JPanel
{
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
        this.canvas = panel;
        
        this.pickColor = new JButton("Pick Color"); //adding the buttons to the ControlPanel
        this.add(this.pickColor);
        
        this.currentColor = new JPanel();
        currentColor.setBackground(canvas.getColor());
        this.add(this.currentColor);
        
        this.addCircle = new JButton("Add Circle");
        this.add(this.addCircle);
        
        this.addSquare = new JButton("Add Square");
        this.add(this.addSquare);
        
        ClickListener listener = new ClickListener(); 
        this.pickColor.addActionListener(listener); //when these buttons are clicked, actions
        this.addCircle.addActionListener(listener); //specified in ClickListner occur based
        this.addSquare.addActionListener(listener); //on the button clicked
    }
    
    /**
     * Calls upon methods in the DrawingPanel class when appropriate button in the ControlPanel
     * is clicked
     */
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals("Pick Color"))
            {
                canvas.pickColor();
                currentColor.setBackground(canvas.getColor()); //sets panel to current color
            }
            else if (event.getActionCommand().equals("Add Circle"))
            {
                canvas.addCircle(); //draws a circle
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                canvas.addSquare(); //draws a square
            }
        }
    }
    

}
