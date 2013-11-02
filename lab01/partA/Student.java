public class Student extends Person
{
   private String course;

   public Student(String id, String name, String course)
   {
      super(id, name);
      this.course = course;
   }

   public String getCourse()
   {
      return course;
   }

   public void setCourse(String course)
   {
      this.course = course;
   }
   
   public void display()
   {
      super.display();
      System.out.println("Course: " + this.course);
   }
}
