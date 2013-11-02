// Laboratory 05
import java.util.*;
import java.io.*;
public class Subject
{
   private String code;
   private String title;
   private int fieldCount;
   private String fieldWeights; // a string with tokens separated by |
   // e.g. F|20|10|70
   private int studentCount;
   private Student[] students;
   private int[] finalMarks; 

   public Subject(String code, String title, int fieldCount, 
         String fieldWeights, int studentCount, Student[] students)
   {
      this.code = code;
      this.title = title;
      this.fieldCount = fieldCount;
      this.fieldWeights = fieldWeights;
      this.studentCount = studentCount;
      this.students = students;
      finalMarks = new int[studentCount];
   }

   public static Subject loadData(Scanner infile)
   {
      String line = infile.nextLine();
      StringTokenizer tokens = new StringTokenizer(line, "|");
      tokens.nextToken();
      line = infile.nextLine();
      String code = tokens.nextToken();

      tokens = new StringTokenizer(line, "|");
      tokens.nextToken();
      line = infile.nextLine();
      String title = tokens.nextToken();

      tokens = new StringTokenizer(line, "|");
      tokens.nextToken();
      int fieldCount = Integer.parseInt(tokens.nextToken());

      String fieldWeights = infile.nextLine();

      line = infile.nextLine();
      tokens = new StringTokenizer(line, "|");
      tokens.nextToken();
      int studentCount = Integer.parseInt(tokens.nextToken());

      //assign all the students into an array
      Student[] students =  new Student[studentCount];
      for(int i = 0; i < studentCount; i++)
      {
         line = infile.nextLine();
         tokens = new StringTokenizer(line, "|");
         tokens.nextToken();
         String studentNumber = tokens.nextToken();
         String familyName = tokens.nextToken();
         String initials = tokens.nextToken();
         double[] marks = new double[fieldCount];

         //to assign marks of student
         for(int j = 0; i < fieldCount; i++)
         {
            marks[j] = Double.parseDouble(tokens.nextToken());
         }
         Student student = new Student(studentNumber, familyName, initials, marks);
         students[i] = student;
      }
      Subject s = new Subject(code, title, fieldCount, fieldWeights, studentCount, students);
      return s;
   }

   public void displayStudents()
   {
         
   }

   public void writeReport(PrintWriter out)
   {
      calculateFinalMarks();
      int highestIndex=0, lowestIndex=0;
      int highest = 0, lowest = 0, totalMarks = 0;
      for(int i = 0; i < studentCount; i++)
      {
         if(highest < this.finalMarks[i])
         {
               highest = this.finalMarks[i];
               highestIndex = i;
         }
         if(lowest > this.finalMarks[i])
         {
            lowest = this.finalMarks[i];
            lowestIndex = i;
         }
         totalMarks += finalMarks[i];
      }
      double average = (double) totalMarks/studentCount;
      System.out.println("The student with the highest mark is: " + students[highestIndex].getName() + ", " + students[highestIndex].getInitials());
      System.out.println("The student with the lowest mark is: " + students[lowestIndex].getName() + ", " + students[lowestIndex].getInitials());
      System.out.println("The average mark is : " + average);
      // Question 2 - to be completed

      // One approach... (if you wish to follow it... )


      // 1. Call a private method calculateFinalMarks() to update final marks
      // 2. Need variables highestMarkIndex, lowestMarkIndex, totalMarks
      // int[] frequencies = new int[11] to store number of stars 


      // for loop to find highest and lowest mark indexes, total marks
      // and fill in frequencies array


      // output the required information followed by the histogram

   }

   private void calculateFinalMarks()
   {
      StringTokenizer tokens = new StringTokenizer(fieldWeights, "|");
      tokens.nextToken();
      double[] weight = new double[this.fieldCount];
      for(int i = 0; i < this.fieldCount; i++)
      {
         weight[i] = Double.parseDouble(tokens.nextToken());
      }

      for(int i = 0; i < this.studentCount; i++)
      {
         System.out.println(students[i]);
      }
      
      for(int i = 0; i < this.studentCount; i++)
      {
         double finalMark = 0;
         for(int j = 0; j < this.fieldCount; j++)
         {
            //finalMark += students[i].getMark(j) * j/100;
         }
         this.finalMarks[i] = (int) Math.round(finalMark);
      }
   }

}
