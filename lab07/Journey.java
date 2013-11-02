import java.util.*;
public class Journey
{
   public static void main(String[] args)
   {
      Segment[] segments = new Segment[25];
      Scanner keyboard = new Scanner(System.in);
      int i = 0;
      while(true)
      {
         System.out.println("Enter Direction (N, S, E or W) and Distance");
         String dir = keyboard.next();
         if(dir.equals("return"))
         {
            break;
         }
         int distance = keyboard.nextInt();
         keyboard.nextLine();
         segments[i] = new Segment(Direction.valueOf(dir), distance);
         i++;
      }
      for(int j = i-1; j >= 0; j--)
      {
         System.out.println(segments[j].opposite());
      }
   }
}

