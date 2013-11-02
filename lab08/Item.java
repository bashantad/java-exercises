public class Item implements Sellable
{
   private String barcode;
   private String description;
   private double unitPrice;
   
   public Item(String barcode, String description, double unitPrice)
   {
      this.barcode = barcode;
      this.description = description;
      this.unitPrice = unitPrice;
   }
   
   public double getPrice()
   {
      return this.unitPrice;
   }

   public String getReceiptLine(){
      return String.format("%13.13s: %-26.26s $%7.2f", barcode, description, unitPrice);
   }

   public String toString()
   {
      return "Item[barcode: " + this.barcode + ", description: " + this.description + ", price: " + this.unitPrice + "]";
   }
}

