public class Rocks implements Sellable, HasMass
{
   private String type;
   private String description;
   private double pricePerCubeMetre;
   private double volume;

   public Rocks(String type, String description, double pricePerCubeMetre, double volume)
   {
      this.type = type;
      this.description = description;
      this.pricePerCubeMetre = pricePerCubeMetre;
      this.volume = volume;
   }

   public String toString()
   {
      return "Rocks[description: " + this.description + ", pricePerCubeMetre: " + this.pricePerCubeMetre + ", volume: " + this.volume + "]"; 
   }

   public double getPrice()
   {
      return this.volume * this.pricePerCubeMetre;
   }

   public String getReceiptLine()
   {
      return String.format("%.2f %s %-41.41s $%7.2f", volume, type, description, getPrice()); 
   }
 
   public double getVolume()
   {
      return this.volume;
   }
}

