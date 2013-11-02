public class ManySpeciesTank extends Tank
{
   private final int SMALL = 3;
   private final int MEDIUM = 6;
   private final int LARGE = 10;
   private Fish[] fish;
   private int numberOfFish;
   private int maxFish;
   public ManySpeciesTank(String id, char tankTemperature, char tankSalinity, char size)
   {
      super(id, tankTemperature, tankSalinity);
      switch(size)
      {
         case 'S':
         case 's':
            maxFish = SMALL;
            break;
         case 'M':
         case 'm':
            maxFish = MEDIUM;
            break;
         case 'L':
         case 'l':
            maxFish = LARGE;
            break;
      }
      this fish = new Fish[maxFish];
   }
   public void display()
   {
      for(int i = 0; i < numberOfFish; i++)
      {
         System.out.println(this.fish[i]);
      }
   }


