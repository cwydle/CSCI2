import java.util.Arrays;
import java.util.Random;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class SortingDemo
{  
/**
   The sort method of this class sorts an array, using the selection 
   sort algorithm.
*/
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
   }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
      
public class SelectionSorter
{
   private static int counter = 0;
   /**
      Sorts an array, using selection sort.
      @param a the array to sort

   */
   public static void sortA(int[] a)
   {  
      for (int i = 0; i < a.length - 1; i++)
      {  
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);

        }
   }

   /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
    * @param count 
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
   private static int minimumPosition(int[] a, int from)
   {  
      int minPos = from;
       for (int i = from + 1; i < a.length; i++)
      {
         counter++; 
         if (a[i] < a[minPos]) { 
             minPos = i; 
             counter++; 
            }
      }
      return minPos;
      }  

      public static int getNumOfSelectionInstances() {
         return counter;
      }
}
/**
   The sort method of this class sorts an array, using the merge 
   sort algorithm.
*/
public class MergeSorter
{
   private static int count = 0; 
   /**
      Sorts an array, using merge sort.
      @param a the array to sort
   */
   public static void sortB(int[] a)
   {  
      if (a.length <= 1) { return; }
      int[] first = new int[a.length / 2];
      int[] second = new int[a.length - first.length];
      // Copy the first half of a into first, the second half into second
      for (int i = 0; i < first.length; i++) 
      { 
         first[i] = a[i]; 
      }
      for (int i = 0; i < second.length; i++) 
      { 
         second[i] = a[first.length + i]; 
      }
      count++;
      sortB(first);
      sortB(second);
      merge(first, second, a);
   }

   /**
      Merges two sorted arrays into an array
      @param first the first sorted array
      @param second the second sorted array
      @param a the array into which to merge first and second
   */
   private static void merge(int[] first, int[] second, int[] a)
   {  
      int iFirst = 0; // Next element to consider in the first array
      int iSecond = 0; // Next element to consider in the second array
      int j = 0; // Next open position in a

      // As long as neither iFirst nor iSecond is past the end, move
      // the smaller element into a
      while (iFirst < first.length && iSecond < second.length)
      {  
         if (first[iFirst] < second[iSecond])
         {  
            a[j] = first[iFirst];
            iFirst++;
            count++;
         }
         else
         {  
            a[j] = second[iSecond];
            iSecond++;
            count++;
         }
         j++;
         count++;
      }

      // Note that only one of the two loops below copies entries
      // Copy any remaining entries of the first array
      while (iFirst < first.length) 
      { 
         a[j] = first[iFirst]; 
         iFirst++; j++;
         count++;
      }
      // Copy any remaining entries of the second half
      while (iSecond < second.length) 
      { 
         a[j] = second[iSecond]; 
         iSecond++; j++;
         count++;
      }
   }
   public static int getNumOfMergeInstances() {
      return count;
   }
}
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(10, 100);
       // Copying elements of a[] to b[]
      int b[] = a.clone();

      System.out.println("Selection Sort for array size 10");
      System.out.println(Arrays.toString(a));
      SelectionSorter.sortA(a);
      System.out.println(Arrays.toString(a));
      int selectioncounter = SelectionSorter.getNumOfSelectionInstances(); 
      System.out.println("The number of iteration is " + selectioncounter);


      System.out.println("Merge Sort for array size 10");
      System.out.println(Arrays.toString(b));
      MergeSorter.sortB(b);
      System.out.println(Arrays.toString(b));
      int mergecounter = MergeSorter.getNumOfMergeInstances();
      System.out.println("The number of iteration is " + mergecounter);

      int[] c = ArrayUtil.randomIntArray(10000, 100);
      int[] d = c.clone();
      System.out.println("Selection Sort for array size 10000");
      SelectionSorter.sortA(c);
      int selectioncounter2 = SelectionSorter.getNumOfSelectionInstances(); 
      System.out.println("The number of iteration is " + selectioncounter2);


      System.out.println("Merge Sort for array size 10000");
      MergeSorter.sortB(d);
      int mergecounter2 = MergeSorter.getNumOfMergeInstances();
      System.out.println("The number of iteration is " + mergecounter2);

   }
}

   
