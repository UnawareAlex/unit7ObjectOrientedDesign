import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Abstract class Shape - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Shape
{
    // instance variables - replace the example below with your own
    public Shape(Point2D.Double center, double radius, Color color)
    {
        // put your code here
    }
    
   //public Point2D.Double getCenter(){}
    
    //public double getRadius(){}
    
    public void move(double x, double y){}
    
    public void setRadius(double r){}
    
   // public boolean isInside(Point2D.Double point){}
    
    public void draw(Graphics2D g2, boolean filled){}
}
