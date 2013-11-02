public class RailroadCar
{
   private String id;
   private double tareWeight;
   
   public RailroadCar(String id, double tareWeight)
   {
      this.id = id;
      this.tareWeight = tareWeight;
   }
   
   public double getTareWeight()
   {
      return this.tareWeight;
   }
   
   public double calculateTotalWeight()
   {
         
   }
   
   public void displayDetails()
   {
      System.out.println("id: " + this.id);
      System.out.println("tareWight: " + this.tareWeight);
   }
}
