import java.util.GregorianCalendar;

public class DriverLicense extends Card
{
    private int expirationYear;
    
   public DriverLicense(String name, int year)
   {  
       super(name);
       this.expirationYear = year;
   }
   
   public boolean isExpired()
   {
       GregorianCalendar calendar = new GregorianCalendar();
       int currentYear = calendar.get(GregorianCalendar.YEAR);
       if (expirationYear < currentYear)
       {
           return false;
       }
       else
       {
           return true;
       }
   }
    
   public String format()
   {
      String formated = super.format();
      formated += "\nExpiration Year: " + expirationYear;
      return formated; 
   }
}