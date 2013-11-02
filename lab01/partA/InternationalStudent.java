public class InternationalStudent extends Student
{
   private String country;

   public InternationalStudent(String id, String name, 
                               String course, String country)
   {
      super(id, name, course);
      this.country = country;
   }

   public String getCountry()
   {
      return country;
   }
   
   public void display()
   {
      super.display();
      System.out.println("Country: " + this.country);
   }
}
