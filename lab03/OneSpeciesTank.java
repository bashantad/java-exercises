public class OneSpeciesTank extends Tank
{
   private final int MAX_FISH = 6;
   private Fish[] fish;
   private int numberOfFish;
   
   public OneSpeciesTank(String id, char tankTemperature, char tankSalinity)
   {
      super(id, tankTemperature, tankSalinity);
      this.numberOfFish = 0;
      this.fish = new Fish[MAX_FISH];
   }
   
   public void display()
   {
      for(int i = 0; i < numberOfFish; i++)
      {
         System.out.println(this.fish[i]);
      }
   }
   
   public boolean canAddFish(Fish theFish)
   {
      return (theFish.waterSuitable(getTankTemperature(), getTankSalinity()) && this.numberOfFish < MAX_FISH && (this.numberOfFish == 0 || theFish.getSpecies().equals(fish[0].getSpecies())));
   }
   
   public boolean addFish(Fish theFish)
   {
      if(canAddFish(theFish))
      {
         fish[this.numberOfFish] = theFish;
         this.numberOfFish++;
         return true;
      }else{
         return false;
      }
   }
   
   public boolean canRemoveFish(String species)
   {
      for(int i = 0; i < this.numberOfFish; i++)
      {
         if(this.fish[i].getSpecies().equals(species))
         {
            return true;
         }
      }
      return false;
   }
   
   public Fish removeFish(String species)
   {
      Fish result = null;
      if(canRemoveFish(species))
      {
         result = fish[numberOfFish-1];
         //fish[numberOfFish-1] = null;
         numberOfFish--;
      }
      return result;
   }
}



