public class Segment
{
   private Direction direction;
   private int distance;

   public Segment(Direction dir, int distance)
   {
      this.direction = dir;
      this.distance = distance;
   }

   public Direction getDirection()
   {
      return this.direction;
   }

   public int getDistance()
   {
      return this.distance;
   }

   public String opposite()
   {
      return Direction.opposite(direction) + " " + this.distance;
   }
}
