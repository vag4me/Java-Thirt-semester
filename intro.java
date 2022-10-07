import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner output = new Scanner(System.in);
        System.out.println("Hello please give two Numbers for addition");
        a = output.nextInt();
        System.out.println("a is = " + a);
        b = output.nextInt();
        System.out.println("b is = " + b);
        System.out.println("a + b = " + (a + b));
    }
}
