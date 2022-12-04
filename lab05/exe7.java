import java.util.ArrayList;

public class ArrayOps
{
   /**
       This method goes through the array of integers identified by
       the only parameter, creating a new ArrayList from the array,
       elimin ating duplicatesfrom the original array.
       @param theArray, an array of integer
       @return uniqueIntAL, the new ArrayList

   */
   public static ArrayList copyArray(int[] anArray)
   {
      ArrayList <Integer> list = new ArrayList <>();
      boolean flag = true;
      for(int i = 0; i < anArray.length; i++)
      {
         for(int j = i - 1; j >= 0; j--)
         {
            if(anArray[i] == anArray[j])
            {
               flag = false;
            }
         }
         if(flag == true)
            {
               list.add(anArray[i]);
            }
         flag = true;   
      }
      return list;

   }
}
