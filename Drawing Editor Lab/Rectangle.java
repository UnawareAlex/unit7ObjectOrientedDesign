import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    public Rectangle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.drawRect((int)getCenter().getX(), (int)getCenter().getY(), (int)getRadius(), (int)getRadius());
    }
}
