public class Soil implements Sellable, HasMass
{
   private String description;
   private double pricePerCubeMetre;
   private double volume;
   private double granularitySize;

   public Soil(String description, double pricePerCubeMetre, double volume, double granularitySize)
   {
      this.description = description;
      this.pricePerCubeMetre = pricePerCubeMetre;
      this.volume = volume;
      this.granularitySize = granularitySize;
   }

   public double getVolume()
   {
      return this.volume;
   }

   public String toString()
   {
      return "Soil[description: " + this.description + ", pricePerCubeMetre: " + this.pricePerCubeMetre + ", volume: " + this.volume + ", granularitySize" + this.granularitySize + "]";
   }

   public double getPrice()
   {
      return this.volume * this.pricePerCubeMetre;
   }

   public String getReceiptLine()
   {

   }
}

