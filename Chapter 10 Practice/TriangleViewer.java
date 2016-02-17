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
    private int numClicks;
    private JFrame frame;
    private TriangleComponent triangle;
    
    public TriangleViewer()
    {
        this.numClicks = 0;
        this.frame = new JFrame("Triangle Fun Time");
        this.triangle = new TriangleComponent();
        this.frame.add(triangle);
        
        MouseClickListener listener = new MouseClickListener();
        triangle.addMouseListener(listener);
        
        this. frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public class MouseClickListener implements MouseListener
    {
        public void actionPerformed(MouseEvent event){}
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event)
        {
            numClicks++;
            int x = event.getX();
            int y = event.getY();
            triangle.updatePoint(numClicks,x,y);
            triangle.repaint();
        }
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
    
    public static void main(String[] args)
    {
        TriangleViewer view = new TriangleViewer();
    }
}