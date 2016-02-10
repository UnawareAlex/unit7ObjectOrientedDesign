import java.util.Scanner;
import java.util.Arrays;

public class Person implements Comparable
{
    private String name;
    
    public Person()
    {
        name = "";
    }
    
    public int compareTo(Object obj)
    {
        Person asdfsadf = (Person)obj;
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Person[] people = new Person[10];
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Please enter a name: ");
            name = s.next();
            
        }
    }
}