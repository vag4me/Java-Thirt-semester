import java.util.Scanner;
import java.util.Arrays;
import java.util.*;  

public class Prep
{
    public static void main(String[] args)
    {
       ArrayList <String> list = new ArrayList <>();
       list.add("hello");
       list.add("world");
       for(String elements:list)
       {
            System.out.println(elements);
       }
       list.remove("world");
       for(String elements:list)
       {
            System.out.println(elements);
       }
    } 
}
