import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Prep
{
    public static void main(String[] args)
    { 
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{1,2,3,4};

        System.out.println(array1 == array2);
        System.out.println(Arrays.equals(array1,array2));
        
        array1 = array2;
        System.out.println(array1 == array2);
        

        int[] array3 =  new int[]{1,3,5};
        int[] array4 =  new int[]{2,4,6};

        array4 = array3;

        for(int i:array4)
        {
            System.out.println(i);
        }


    } 
}
