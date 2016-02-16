import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Point;

public class TriangleComponent extends JComponent
{
    private Point p1;
    private Point p2;
    private Point p3;
    private int count;
    
    public TriangleComponent()
    {
        count = 1;
    }
    public void PaintComponent(Graphics g)
    {
        g.drawOval(1, 1, 1, 1);
    }
    
    public void updatePoint()
    {
        if (count == 1)
        {
            p1.setLocation(
        }
        else if (count == 2)
        {
        }
        else if (count == 3)
        {
        }
        else
        {   
            count = 1;
        }
    }
}