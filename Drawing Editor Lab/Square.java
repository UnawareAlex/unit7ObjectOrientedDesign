import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        Rectangle rect = new Rectangle((int)getCenter().getX(), (int)getCenter().getY(), (int)getRadius(), (int)getRadius());
        if (rect.contains(point.getX(), point.getY()))
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
        g2.fillRect((int)getCenter().getX(), (int)getCenter().getY(), (int)getRadius(), (int)getRadius());
    }
}
