public class IDCard extends Card
{
    private int iDNumber;
    
   public IDCard(String name, int id)
   {  
       super(name);
       iDNumber = id;
   }
   
   public String format()
   {
      String formated = super.format();
      formated += "\nID Number: " + iDNumber;
      return formated; 
   }
}