public class ArrayOps
{
   /**
      This method sums up both rows of a two-dimensional array
      (the only parameter to the method) and returns the greater sum.
      @param theArray, a 2-D array of integers
      @return, the greater row sum
   */
   public static int bigSum(int[][] theArray)
   {
      int sum = 0;
      int max = 0;
      for(int i=0; i < theArray.length; i++)
      {
         for(int j=0; j < theArray[i].length; j++)
         {
            sum = sum + theArray[i][j];
            if(sum > max)
            {
               max = sum;
            }
         }
         sum = 0;
      }
      return max;

   }
}
