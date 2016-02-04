import java.util.ArrayList;
import java.util.Collections;

/**
   A coin with a monetary value.
*/
public class Coin implements Comparable<Coin>
{
   private double value;
   private String name;

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }
   
   public int compareTo(Coin other)
   {
       Coin otherCoin = other;
       
       return (int)(this.value - otherCoin.value);
       
//         if (this.value > otherCoin.value)
//         {
//            return 1;
//         }
//         else if (this.alue < otherCoin.value)
//         {
//             return -1;
//         }
//         else
//         {
//             return 0;
//         }
        
    }
    
    public static void main(String[] args)
    {
        ArrayList<Coin> list = new ArrayList<Coin>();
        list.add(new Coin(.10, "dime"));
        list.add(new Coin(.25, "quarter"));
        list.add(new Coin(.01, "penny"));
        list.add(new Coin(.05, "nickel"));
        
        System.out.println("Original List: " + list);
        
        Collections.sort(list);
        
        System.out.println("Sorted List: " + list);
                                
    }
}
