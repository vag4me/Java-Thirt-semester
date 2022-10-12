import java.util.Scanner;

public class lab
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("please give 3 numbers");
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if(a > b && a > c)
        {
            System.out.println("a is the bigger");
        }
        else if(b > a && b > c)
        {
            System.out.println("b is the bigger");
        }
        else
        {
            System.out.println("c is the bigger");
        }
        
	}
}
