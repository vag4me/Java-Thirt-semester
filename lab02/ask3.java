import java.util.Scanner;

public class lab02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int angle,temp;
        
        System.out.println("please give an angle");
        angle = input.nextInt();
        
        if(angle > 360)
        {
         	   temp = angle - 360;
            System.out.println("the angle now is" + temp);
        }
        else if(angle < 0)
        {
            temp = 360 - (angle * -1);
            System.out.println("the angle now is" + temp);             
        }
        else
        {
            System.out.println("the angle is" + angle);
		}   
  
    }
}
