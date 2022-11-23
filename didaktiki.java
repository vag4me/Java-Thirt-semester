import java.util.Scanner;

class didaktiki
{
    Scanner input = new Scanner(System.in);
    public didaktiki()
    {
        int asw,count2=0,count3=0; 
        int count=0,max = 0,i=0;
        do
        {
            asw = input.nextInt();
            i++;
            if(asw != 0)
            {
                if(asw > max)
                {
                    max = asw;
                    count = 1;
                    count2 = i;
                }
                else if(max == asw)
                {
                    count++;
                    count3 = i;
                }
            }
        }while(asw != 0);
        System.out.println(max);
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
    }
}


public class Prep
{
    public static void main(String[] args)
    {
        System.out.println("Welcome give 3 nunmbers");
        didaktiki obj = new didaktiki();
    }
}
