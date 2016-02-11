import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleViewer extends JComponent
{
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 1000;
    private JFrame frame;
    private JPanel panel;
    private JComponent component;
    
    public TriangleViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.frame.add(panel);
        
        MousePressListener listener = new MousePressListener();
        component.addMouseListener(listener);
        
        this. frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public class MousePressListener implements MouseListener
    {
        public void actionPerformed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
        }
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
}