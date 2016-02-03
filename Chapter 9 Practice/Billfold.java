public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold()
    {
        card1 = null;
        card2 = null;
    }
    
    public void addCard(Card newCard)
    {
        if (card1 == null)
        {
            card1 = newCard;
        }
        else if (card2 ==  null)
        {
            card2 = newCard;
        }
    }
    
    public int getExpiredCardCount()
    {
        int numExpired = 0;
        if (card1.isExpired() == true)
        {
            numExpired++;
        }
        if  (card2.isExpired() == true)
        {
            numExpired++;
        }
        return numExpired;
    }
    
    public String formatCards()
    {
        return card1.format() + "\n" + card2.format();
    }
}