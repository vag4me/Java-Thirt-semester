import java.util.Scanner;
import java.util.Arrays;
import java.util.*;  

public class Prep
{
    public static void main(String[] args)
    {
       Stack <String> s = new Stack <>();
       s.push("a");
       s.push("b");
       s.push("c");
       for(String elements:s)
       {
        System.out.println(elements);
       } 
       s.pop();
       for(String elements:s)
       {
        System.out.println(elements);
       } 
    } 
}
