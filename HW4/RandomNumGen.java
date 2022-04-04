import java.util.Random;

public class RandomNumGen {
    //makes a method 
    public int getRandom() {
    //uses random method
    Random rand = new Random();
    int max = 10; 
    // num1 is whatever random number from 0-9
    int num1 = rand.nextInt(max);
    //returns the random number
    return num1; 
}


} 
