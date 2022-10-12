import java.lang.Math;
import java.util.Scanner;

public class lab
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double pv,fv,intt,yrs;
        
        System.out.println("please give intrest rate ");
        intt = input.nextDouble();
        
        System.out.println("Please give Years ");
        yrs = input.nextDouble();
        
        System.out.println("please give present value ");
        pv = input.nextDouble();
        
        fv = pv * Math.pow(1+ intt/100,yrs);
        
        System.out.println("the money : " + fv);
        
    }
}
