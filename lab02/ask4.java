import java.lang.Math;


public class lab 
{
    public static void main(String[] args)
    {
        double x1=1,x2=2,y1=3,y2=4;
        double re,temp1,temp2,temp3;
        
        temp1 = Math.pow(x1-x2,2);
        temp2 = Math.pow(y1-y2,2);
        temp3 = temp1 + temp2;
        
        re = Math.sqrt(temp3);
        System.out.println("result is " + re);
        
	}
} 
