public class Sum
{
   public static int recursiveSum(int n)
   {
      if(n==0){
         return 0;
      }else{
         return n + recursiveSum(n-1);
      }
   }
}

