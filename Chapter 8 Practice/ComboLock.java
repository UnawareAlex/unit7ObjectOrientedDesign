public class ComboLock
{
   private int currentNum = 0; 
   private int num1;
   private int num2;
   private int num3;
   private boolean status1 = false;
   private boolean status2 = false;
   private boolean status3 = false;
   int count = 0;
   public ComboLock( int secret1, int secret2, int secret3 ) 
   { 
       num1 = secret1;
       num2 = secret2;
       num3 = secret3;
    }
   public void reset() 
   {
       currentNum = 0; 
    }
   public void turnRight( int ticks ) 
   {
       int newPos = currentNum - ticks;
       if (newPos < 0)
       {
           currentNum = 40 + newPos;
       }
       else
       {
           currentNum = newPos;
       }
       if (count == 0 && currentNum == num1)
       {
           status1 = true;
       }
       if (count == 2 && currentNum == num3)
       {
           status3 = true;
       }
       count++;
   }
   public void turnLeft( int ticks ) 
   {
       int newPos = currentNum + ticks;
       if (newPos > 40)
       {
           currentNum = newPos - 40;
       }
       else
       {
           currentNum = newPos;
       }
       if (count == 1 && currentNum == num2)
       {
           status2 = true;
       }
       count++;
   }
   public boolean open() 
   {
       if (status1 && status2 && status3)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}