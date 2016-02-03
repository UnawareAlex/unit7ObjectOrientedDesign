import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle()
    {
        this.setLocation(0,0);
        this.setSize(10,10);
    }
    
    public double getPerimeter()
    {
        double perimeter = (2 * this.getHeight()) + (2 * this.getWidth());
        return perimeter;
    }
    
    public double getArea()
    {
        double area = (this.getHeight() * this.getWidth());
        return area;
    }
}