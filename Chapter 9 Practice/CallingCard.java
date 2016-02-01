public class CallingCard extends Card
{
    private int cardNumber;
    private int pin;
    
   public CallingCard(String name, int card, int pin)
   {  
       super(name);
       this.cardNumber = card;
       this.pin = pin;
   }
   
   public String format()
   {
      String formated = super.format();
      formated += "\nCard Number: " + cardNumber;
      formated += "\nPIN: " + pin;
      return formated; 
   }
}