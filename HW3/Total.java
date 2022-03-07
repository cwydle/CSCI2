import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Total
{
   public static void main(String[] args) throws FileNotFoundException
   {

      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file for boy: ");
      String outputFileNameBoy = console.next();
      System.out.print("Output file for girl: ");
      String outputFileNameGirl = console.next();
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter outB = new PrintWriter(outputFileNameBoy);
      PrintWriter outG = new PrintWriter(outputFileNameGirl);

      int totalB = 0;
      int totalG = 0;       
      int tenmillionth = 10000000; 
      String All = ""; 
      boolean found = false; 
      while (in.hasNext())
      {
         String A = in.next();
         String B = in.next();
         int C = in.nextInt();
         totalB += C; 
         double D = in.nextDouble();
         String E = in.next();         
         int F = in.nextInt();
         totalG += F; 
         double G = in.nextDouble();
         outB.printf("%s\n", B);
         outG.printf("%s\n", E);
      }
      System.out.println("the name of the baby that first crossed 10 Millionth babies is " + All);
      System.out.println("The total number of baby boys born this year is " + totalB);
      System.out.println("The total number of baby girls born this year is " + totalG);
      in.close();
      outB.close();
      outG.close();
   }
}
//STeps
// 1 read line by line
//2. for each line
//2.1 read  2nd token into boyname <---next(); 
//2.2 write boy name to output 3
//2.5 read 5th token (the girls name) 
//2.4 write girls name to output
// have it repeated in a while loop
// While (in.hasNext()) {
// String A = in.Next();
// String B = in.Next(); 
// int C = in.NextInt();
// double D = in.NextDouble();
// String E = in.Next();
//int F = in.NextInt();
// double G = in.Next Double(); // the cursor is at the next token
//}
