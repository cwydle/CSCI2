import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program reads a file with numbers, and writes the numbers to another
   file, lined up in a column and followed by their total. 
*/
public class Total
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Prompt for the input and output file names

      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file for boy: ");
      String outputFileNameBoy = console.next();
      System.out.print("Output file for girl: ");
      String outputFileNameGirl = console.next();


      // Construct the Scanner and PrintWriter objects for reading and writing

      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter outB = new PrintWriter(outputFileNameBoy);
      PrintWriter outG = new PrintWriter(outputFileNameGirl);


      // Read the input and write the output

      int totalB = 0;
      int totalG = 0;       
      while (in.hasNext())
      //grabs the next token 
      {
         String A = in.next();
         //grabs the first token which is 1 and store it in A. 
         //there are 7 tokens 
         String B = in.next();
         int C = in.nextInt();
         totalB += C; 
         double D = in.nextDouble();
         String E = in.next();         
         int F = in.nextInt();
         totalG += F; 
         double G = in.nextDouble();
// 3) what's the name of baby (boy or girl) that first crossed 10 Millionth babies (summing from most popular baby names, that is, from the top down.)? (2 points)

         //michael will be stored in B. the cursor goes to the next element which is the number 462086
         outB.printf("%s\n", B);
         outG.printf("%s\n", E);
         //the last item is stored in String G. The "in" goes to the next line which is 2. 
         //.next() will store the token in the object and then goes to the next line 
         //put the String A = in.next() into a loop
         //need the 3rd and 6th item
      }
      System.out.println("The total number of baby boys born this year is " + totalB);
      System.out.println("The total number of baby girls born this year is " + totalG);

      in.close();
      outB.close();
      outG.close();

   }
}

