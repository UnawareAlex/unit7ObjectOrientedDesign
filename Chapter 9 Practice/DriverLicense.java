public class DriverLicense extends Card
{
    private int expirationYear;
    
   public DriverLicense(String name, int year)
   {  
       super(name);
       this.expirationYear = year;
   }
   
   public String format()
   {
      String formated = super.format();
      formated += "\nExpiration Year: " + expirationYear;
      return formated; 
   }
}