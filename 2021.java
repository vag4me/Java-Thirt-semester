import java.util.ArrayList;
import java.util.Scanner;
import java.io.* ;
import java.util.*;

public class world
{
    public static void main(String[] args)
    {
        person obj1 = new person();
        obj1.set(Covid19Immunity.values()[1],"2022/5/5");
        String re = obj1.ExpectedEnd();
        System.out.println(re);

    }

}

interface Immunable
{
    public void set(Covid19Immunity im, String date);
    public String ExpectedEnd();
}

class person implements Immunable
{
    static int count = 0;
    Covid19Immunity k;
    String date;
    int anosia = 0;
    
    public void set(Covid19Immunity k,String date)
    {
        this.k = k;
        if(k.toString().equals("VACCINATED"))
        {
            count++;
        }   
        this.date = date;
    }
    public String ExpectedEnd()
    {
        if(k.toString().equals("INFECTED"))
        {
            anosia = 6;
        }
        else if(k.toString().equals("VACCINATED"))
        {
            if(count == 2)
            {
                anosia = 6;
            }
            else if(count == 1)
            {
                anosia = 0;
            }
        }
        else if(k == null)
        {
            anosia = 0;
        }
        return "date is " + date + " plas tin anosia " + anosia;
        
    }

}


enum Covid19Immunity
{
    VACCINATED,
    INFECTED
}
