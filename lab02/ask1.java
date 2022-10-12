import java.util.Scanner;

public class lab02
{
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    	int sideA;
        int sideB;
        
        sideA = input.nextInt();
        sideB = input.nextInt();
        
        System.out.println("embadon = " + sideA*sideB);    
	}
}
