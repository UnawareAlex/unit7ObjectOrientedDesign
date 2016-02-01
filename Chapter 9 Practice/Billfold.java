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
    
    public String formatCards()
    {
        
    }
}