import java.util.Scanner;

public class lab 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double grade;
        
        System.out.println("please give your grade");
        grade = input.nextDouble();
        
        if(grade > 90 && grade <= 100)
        {
            System.out.println("You are A");
        }
        else if(grade > 80 && grade <= 90)
        {
            System.out.println("You are a B");
		}
        else if(grade > 70 && grade <= 80)
        {
            System.out.println("You are c");
		}
        else if(grade > 60 && grade <= 70)
        {
            System.out.println("you are a d");
        }
        else 
        {
            System.out.println("You are a f");
        }
    }
}
