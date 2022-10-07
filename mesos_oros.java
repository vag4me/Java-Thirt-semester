import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Give 3 numbers to calculate the MO");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        float mo = (a + b + c)/3f;
        
        System.out.println("mo is = " + mo );
        
    }
}
