public class ArrayOps
{
   /**
      This method performs a linear search on the array identified by
      the first parameter, while looking for the value indicated by
      the second parameter.
      @param values, an array of integers
      @param valueToFind, an integer to look for in the array values
      @ return, the index (subscript) of the array where the value
            was found OR the length of the array if it was not found.
   */
   public static int findValue(int values[], int valueToFind)
   {
      int count = 0;
      for(int elements:values)
      {
         if(elements == valueToFind)
         {
            return count;
         }
         count++;
      }
      return count;
   
   }
}
