public class Geometry
{
   public static String triangleType(int a, int b, int c)
   {
      String result;
      if(a+b <= c || b+c <= a || a+c <= b || a <= 0 || b <= 0 || c <= 0)
      {
         result = "invalid";
      }
      else if(a==b && b == c)
      {
         result = "equilateral";
      }
      else if(a==b || b==c || a==c)
      {
         result = "isosceles";
      }
      else
      {
         result = "scalene";
      }
      return result;
   }
}
