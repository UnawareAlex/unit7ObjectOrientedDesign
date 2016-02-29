import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
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

    }
    
    public Point2D.Double getCenter(){}
    
    public double getRadius(){}
    
    public void move(double x, double y){}
    
    public void setRadius(double r){}
    
    public boolean isInside(Point2D.Double point){}
    
    public void draw(Graphics2D g2, boolean filled){}
}
