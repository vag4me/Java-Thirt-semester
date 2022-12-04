public class ArrayOps
{
   /**
      This method accepts and integer array as a parameter, and then
      returns the "middle" value of the array.
      For an array of odd length, this would be the actual middle value.
      For an array of even length, there are TWO middle values, so only
      the first of the two values is returned.
      @param values, an array of integers
      @ return, the "middle" element of the array
   */
   public static int middleArray(int values[])
   {
      if(values.length % 2 == 0)
      {
         return values[(values.length/2)-1];
      }
      if(values.length % 2 != 0)
      {
         return values[values.length/2];
      }
      return 0;
   }
}
