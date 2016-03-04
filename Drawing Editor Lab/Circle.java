import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double((int)getCenter().getX(), (int)getCenter().getY(), (int)getRadius(), (int)getRadius());
        if (this.getCenter().distance(point) < this.getRadius())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(getColor());
        g2.fillOval((int)getCenter().getX(), (int)getCenter().getY(), (int)getRadius(), (int)getRadius());
    }
}
