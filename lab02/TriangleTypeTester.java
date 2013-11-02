import java.util.*;
public class TriangleTypeTester
{
   public static void main(String[] args)
   {
      int passedTests = 0;
      int failedTests = 0;
      System.out.println("Tests");
      System.out.println("-----");

      int a = 3;
      int b = 4;
      int c = 5;
      String expected = "scalene";

      // Test 1
      System.out.print("Test 1: <test description> - "); // replace < >
      String result1 = Geometry.triangleType(a, b, c);
      System.out.println("Expected Result: " + expected);
      System.out.println("Actual Result: " + result1);
      if (result1.equals(expected))  // the expected result
      {
         System.out.println("SUCCESSFUL");
         ++passedTests;
      }
      else
      {
         System.out.println("FAILED");
         ++failedTests;
      }

      // next test - new values for a, b, c and expected 
      // then copy code for Test 2 and so on for Test 3
      //Test 2
      a = 2;
      b = 3;
      c = 5;
      expected = "invalid";
      System.out.print("Test 2: <test description> - "); // replace < >
      String result2 = Geometry.triangleType(a, b, c);
      System.out.println("Expected Result: " + expected);
      System.out.println("Actual Result: " + result2);
      if (result2.equals(expected))  // the expected result
      {
         System.out.println("SUCCESSFUL");
         ++passedTests;
      }
      else
      {
         System.out.println("FAILED");
         ++failedTests;
      }

      //Test 3
      expected = "equilateral";
      System.out.print("Test 3: <test description> - "); // replace < >
      String result3 = Geometry.triangleType(3, 3, 3);
      System.out.println("Expected Result: " + expected);
      System.out.println("Actual Result: " + result3);
      if (result3.equals(expected))  // the expected result
      {
         System.out.println("SUCCESSFUL");
         ++passedTests;
      }
      else
      {
         System.out.println("FAILED");
         ++failedTests;
      }

      // Test 4
      expected = "isosceles";
      System.out.print("Test 4: <test description> - "); // replace < >
      String result4 = Geometry.triangleType(3, 3, 2);
      System.out.println("Expected Result: " + expected);
      System.out.println("Actual Result: " + result4);
      if (result4.equals(expected))  // the expected result
      {
         System.out.println("SUCCESSFUL");
         ++passedTests;
      }
      else
      {
         System.out.println("FAILED");
         ++failedTests;
      }

      //Test5
      expected = "scalene";
      System.out.print("Test 5: <test description> - "); // replace < >
      String result5 = Geometry.triangleType(3, 4, 2);
      System.out.println("Expected Result: " + expected);
      System.out.println("Actual Result: " + result5);
      if (result5.equals(expected))  // the expected result
      {
         System.out.println("SUCCESSFUL");
         ++passedTests;
      }
      else
      {
         System.out.println("FAILED");
         ++failedTests;
      }

      //Test 6
      expected = "invalid";
      System.out.print("Test 5: <test description> - "); // replace < >
      String result6 = Geometry.triangleType(3, 4, 0);
      System.out.println("Expected Result: " + expected);
      System.out.println("Actual Result: " + result6);
      if (result6.equals(expected))  // the expected result
      {
         System.out.println("SUCCESSFUL");
         ++passedTests;
      }
      else
      {
         System.out.println("FAILED");
         ++failedTests;
      }

      //Dynamic testing
      Scanner keyboard = new Scanner(System.in);
      String result;
      char ch;
      do
      {
         System.out.print("\nCheck if the sides of triangle are valid:\nenter value of a, b, c " );
         a = keyboard.nextInt();
         b = keyboard.nextInt();
         c = keyboard.nextInt();
         keyboard.nextLine();
         System.out.print("\nWhat should be the expected output?");
         expected = keyboard.nextLine();
         System.out.println("Expected Result: " + expected);
         result = Geometry.triangleType(a,b,c);
         System.out.println("Actual Result: " + result);
         if(result.equals(expected))
         {
            System.out.println("Successful");
            ++passedTests;
         }
         else
         {
            System.out.println("Failed");
            ++failedTests;
         }
         System.out.print("Do you want to continue testing?(y/n): ");
         ch = keyboard.nextLine().charAt(0);

      }while(ch != 'n');
      //Testing report
      int totalTests = failedTests + passedTests;
      System.out.println();
      System.out.println("Testing Report");
      System.out.println("--------------");
      System.out.println("PASSED tests: " + passedTests);
      System.out.println("FAILED tests: " + failedTests);
      System.out.println("TOTAL tests: " + totalTests);



   }
}
