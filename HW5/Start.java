import java.util.Random;
import java.util.Scanner;

public class Start {
    public static int Sum(int a[], int n) {
        //recursion 
        if (n <= 0) { //base case
            return a[n]; 
        }
            else {
                return a[n] + Sum(a, n-1);  
                //method calls itself by denoting Sum(a, n-1)
            }
        }
    public static void main(String[] args) {
        System.out.println("How big do you want your array to be: ");
        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        Random ran = new Random(); 
        int array[] = new int[user];

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(101); // store random integers in an array        
    }
    // Addup abc = new Addup();
    // int totoal = abc.Sum(array, array.length-1); 
    int total = Sum(array, array.length-1); 
    //adds up the numbers in the arry
    System.out.println("the total is: " + total);
    //prints out the sum 

    }
}