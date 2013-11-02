public class Staff extends Person
{
   private String department;

   public Staff(String id, String name, String department)
   {
      super(id, name);
      this.department = department;
   }

   public String getDepartment()
   {
      return department;
   }

   public void setDepartment(String department)
   {
      this.department = department;
   }
   
   public void display()
   {
      super.display();
      System.out.println("Department : " + this.department);
   }
}
