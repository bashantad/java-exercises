public class Town
{
   public static int calculateGreetings(int n)
   {
      if(n == 1)
      {
         return 0;
      }else{
         return (n-1) + calculateGreetings(n-1);
      }
   }
}
