import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Point;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.event.MouseListener;

public class TriangleComponent extends JComponent
{
    private Point p1;
    private Point p2;
    private Point p3;
    private Ellipse2D.Double dot1;
    private Ellipse2D.Double dot2;
    private Ellipse2D.Double dot3;
    private Line2D.Double line1;
    private Line2D.Double line2;
    private Line2D.Double line3;
    private int numClicks;
    
    public TriangleComponent()
    {
        numClicks = 0;
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
        this.p3 = new Point(0, 0);
        this.dot1 = new Ellipse2D.Double(0, 0, 0, 0);
        this.dot2 = new Ellipse2D.Double(0, 0, 0, 0);
        this. dot3 = new Ellipse2D.Double(0, 0, 0, 0);
        this.line1 = new Line2D.Double(0, 0, 0, 0);
        this.line2 = new Line2D.Double(0, 0, 0, 0);
        this.line3 = new Line2D.Double(0, 0, 0, 0);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        if (numClicks == 1)
        {
            dot1.setFrame(p1.getX() - 2, p1.getY() - 2, 4, 4);
            System.out.println("Point 1 at x = " + p1.getX() + " and y = " + p1.getY());
            g2.draw(dot1);
        }
        else if (numClicks == 2)
        {
            dot2.setFrame(p2.getX() - 2, p2.getY() - 2, 4, 4);
            System.out.println("Point 2 at x = " + p2.getX() + " and y = " + p2.getY());
            g2.draw(dot1);
            g2.draw(dot2);
        }
        else if (numClicks == 3)
        {
            dot3.setFrame(p3.getX() - 2, p3.getY() - 2, 4, 4);
            System.out.println("Point 3 at x = " + p3.getX() + " and y = " + p3.getY());
            g2.draw(dot1);
            g2.draw(dot2);
            g2.draw(dot3);
        }
    }
    
    public void updatePoint(int count, int x, int y)
    {
        if (count == 1)
        {
            p1.setLocation(x, y);
            numClicks = 1;
        }
        else if (count == 2)
        {
            p2.setLocation(x, y);
            numClicks = 2;
        }
        else if (count == 3)
        {
            p3.setLocation(x, y);
            numClicks = 3;
        }
        else
        {   
            numClicks = 0;
        }
    }
}