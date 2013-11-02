import java.util.*;
import java.io.*;
public class ReadRules
{
   public static void main(String[] args)
   {
      try{

         ObjectInputStream numFile = new ObjectInputStream(new FileInputStream("numbers3.bin"));
         ObjectInputStream strFile = new ObjectInputStream(new FileInputStream("rules3.bin"));
         for(int i = 0; i < 5; i++)
         {
            System.out.println(numFile.readInt());
         }
         System.out.println(strFile.readUTF());
         numFile.close();
         strFile.close();
      }catch(EOFException e){
         System.out.println(e);
      }
      catch(FileNotFoundException e)
      {
         System.out.println(e);
      }
      catch(IOException e)
      {
         System.out.println(e);
      }
   }
}
