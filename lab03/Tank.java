public abstract class Tank
{
   private String id;
   private char tankTemperature;
   private char tankSalinity;
   
   public Tank(String id, char tankTemperature, char tankSalinity)
   {
      this.id = id;
      this.tankTemperature = tankTemperature;
      this.tankSalinity = tankSalinity;
   }
   
   public String getId()
   {
      return this.id;
   }
   
   public char getTankTemperature()
   {
      return this.tankTemperature;
   }

   public char getTankSalinity()
   {
      return this.tankSalinity;
   }

   public abstract void display();
   public abstract boolean canAddFish(Fish theFish);
   public abstract boolean addFish(Fish theFish);
   public abstract boolean canRemoveFish(String species);
   public abstract Fish removeFish(String species);
}

