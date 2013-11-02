public class Timber implements Sellable
{
   private String type;
   private double thickness;
   private double width;
   private double length;
   private double pricePerMetre;

   public Timber(String type, double thickness, double width, double length, double pricePerMetre)
   {
      this.type = type;
      this.thickness = thickness;
      this.width = width;
      this.length = length;
      this.pricePerMetre = pricePerMetre;
   }

   public String toString()
   {
      return "Timber[type: " + this.type + ", thickness: " + this.thickness + ", width: " + this.width + ", height: " + this.length + ", pricePerMetre: " + this.pricePerMetre + "]";
   }

   public double getPrice()
   {
      return this.length * this.pricePerMetre/100;
   }

   public String getReceiptLine()
   {
      String part1 = String.format("%.2fm of %.2fcm * %.2fcm  %s", length/100, thickness, width, type);
      
      return String.format("%-41.41s $%7.2f", part1, getPrice());
   }
}
