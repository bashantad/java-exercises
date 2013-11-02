public class Tester
{
   public static void main(String[] args)
   {
      // Person class tests
      test1();
      test2();
      test3();
   }

   public static void test1()
   {
      // test each method in the Person class
      Person p = new Person("1010101", "Ada Lovelace"); 
      System.out.println("getId(): " + p.getId());
      System.out.println("getName(): " + p.getName());
      System.out.println("display(): ");
      p.display();
   }

   public static void test2()
   {
      // test each method in the Student class
      Student  s = new Student("189488485", "Johny Smith", "Computer Science");
      System.out.println("getId(): " + s.getId());
      System.out.println("getName(): " + s.getName());
      System.out.println("getCourse(): " + s.getCourse());
      System.out.println("display(): ");
      s.display();
   }

   public static void test3()
   {
      //Test an array of person class
      System.out.printf("\n\nTesting all the display methods in an array\n");
      Person persons[] = new Person[4];
      persons[0] = new Person("349945945", "Main Super Person");
      persons[1] = new Staff("49439439", "Eric Pardede", "Computer Science: Database");
      persons[2] = new Student("4399494", "Chris Brown", "Child psychology");
      persons[3] = new InternationalStudent("439943934", "Rahul Bhujel", "Machine Learning", "Bhutan");
      for(int i = 0; i < 4; i++)
      {
         persons[i].display();
      }
   }
}
