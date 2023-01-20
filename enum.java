import java.util.ArrayList;
import java.util.Scanner;
import java.io.* ;
import java.util.*;

public class world
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       String f;
       f = in.nextLine();
       food[] all = food.values();
       System.out.println(all[0]);

       for(food d: all)
       {
            if(d.toString().equals(f))
            {
                System.out.println("you are correct");
            }
       }
    }

}

enum food
{
    APPLE,
    PASTA,
    CROISANT
}
