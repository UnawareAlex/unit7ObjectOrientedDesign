public class IDCard extends Card
{
    private int idNumber;
    
   public IDCard(String name, int id)
   {  
       super(name);
       idNumber = id;
   }
   
   public String format()
   {
      String formated = super.format();
      formated += "\nID Number: " + idNumber;
      return formated; 
   }
   //override the equals method defined in Card as well as Object
   public boolean equals(Object other)
   {
      //check if this object and the other object are both of the same class
      if (this.getClass() ==  other.getClass())
      {
          //first check if this object and the other object are equal from the perspective of
          //the superclass (i.e. Card)
          boolean isEqual = super.equals(other);
          
          //second, cast the other object to an IDCard and check if idNumbers are equal
          IDCard otherIDCard = (IDCard) other;
          return is Equal && this.idNumber.equals(otherIDCard.idNumber);
      }
      
      return false
   }
}