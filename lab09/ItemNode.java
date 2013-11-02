public class ItemNode
{
   private Item item;
   private ItemNode next;
   public ItemNode(Item item)
   {
      this.item = item;
      this.next = null;
   }

   public Item getItem()
   {
      return this.item;
   }

   public ItemNode getNext()
   {
      return this.next;
   }

   public void setNext(ItemNodeNode next)
   {
      this.next = next;
   }
}
