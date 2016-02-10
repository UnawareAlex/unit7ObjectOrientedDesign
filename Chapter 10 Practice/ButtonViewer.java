import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    private JFrame frame;
    private JButton button;
    
    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.button = new JButton("Click Me!");
        this.frame.add(this.button);
        
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        
        this. frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }
}