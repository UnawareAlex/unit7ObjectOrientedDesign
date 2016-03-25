import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Outline for the Circle and Square Classes
 * 
 * Alex Arnold
 *
 */
public abstract class Shape
{
   private double xCord; //designating standards for all shapes
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
    
   /**
     * returns the center of a shape
     *
     * @return     center of shape
     */
   public Point2D.Double getCenter()
   {
       Point2D.Double center = new Point2D.Double(xCord, yCord);
       return center;
   }
    
   /**
     * returns radius of the shape
     *
     * @return     radius of shape
     */
   public double getRadius()
   {
       return radius;
   }
    
  

    /**
     * moves the center of the shape to a specified location
     * 
     * @param x     new x-cord
     * @param y     new y-cord
     */ 
    public void move(double x, double y)
   {
       xCord = x;
       yCord = y;
   }
   
   /**
     * sets the radius of a shape to the specified size
     * 
     * @param r     new radius
     */
   public void setRadius(double r)
   {
       radius = r;
   }
   
   /**
     * returns the color of the shape
     *
     * @return     color of shape
     */
   public Color getColor()
   {
      return color; 
   }
   
   public abstract boolean isInside(Point2D.Double point);
    
   public abstract void draw(Graphics2D g2, boolean filled);

}
