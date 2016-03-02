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
   private double xCord;
   private double yCord;
   private double radius;
   private Color color;
   public Shape(Point2D.Double center, double radius, Color color)
   {
       this.xCord = center.getX();
       this.yCord = center.getY();
       this.radius = radius;
       this.color = color;
   }
    
   public Point2D.Double getCenter()
   {
       Point2D.Double center = new Point2D.Double(xCord, yCord);
       return center;
   }
    
   public double getRadius()
   {
       return radius;
   }
    
   public void move(double x, double y)
   {
       xCord = x;
       yCord = y;
   }
    
   public void setRadius(double r)
   {
       radius = r;
   }
   
   public Color getColor()
   {
      return color; 
   }
   public abstract boolean isInside(Point2D.Double point);
    
   public abstract void draw(Graphics2D g2, boolean filled);

}
