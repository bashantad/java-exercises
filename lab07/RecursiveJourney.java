import java.util.*;
public class RecursiveJourney
{
   public static final Scanner keyboard = new Scanner(System.in); 
   public int i=0;
   public Segment[] segments = new Segment[25];
   public static void main(String[] args)
   {
      move();
   }

   public static void move()
   {
      System.out.println("Enter Direction (N, S, E or W) and distance");
      String direction = keyboard.next();

      if(direction.equals("return")){
         /*for(int j = i - 1; j >= 0; j--)
           {

           }*/
         return;
      }
      int distance = keyboard.nextInt();

      keyboard.nextLine();
      move();


      Segment segment = new Segment(Direction.valueOf(direction), distance);
      System.out.println(segment.opposite());
   }
}
