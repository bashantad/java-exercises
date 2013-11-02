public class Person
{
   private String id;
   private String name;

   public Person(String id, String name)
   {
      this.id = id;
      this.name = name;
   }

   public String getId()
   {
      return id;
   }

   public String getName()
   {
      return name;
   }

   public void display()
   {
      System.out.printf("id: %s\nname: %s\n", this.id, this.name);
   }
}
