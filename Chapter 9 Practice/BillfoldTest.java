public class BillfoldTest
{
    public static void main(String[] args)
    {
        IDCard id = new IDCard("Alex", 6723);
        CallingCard call = new CallingCard("Jon", 5672347, 4243);
        Billfold bill = new Billfold();
        bill.addCard(id);
        bill.addCard(call);
        System.out.print(bill.formatCards());
    }
}