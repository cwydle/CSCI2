import java.util.Scanner;

public class Quiz {
    static int points = 0;
    static Scanner scan = new Scanner(System.in);

    Question Que = new Question();
    static RandomNumGen random = new RandomNumGen();
    int n1 = random.getRandom();
    int n2 = random.getRandom();
    public static boolean levelOne() {

        int numberOne = random.getRandom();
 
        int numberTwo = random.getRandom() - numberOne;
 
        int answer = numberOne + numberTwo;
 
        int count = 0;
 
 
        while (points < 5 && count < 2) {

 
            System.out.println("What is " + numberOne + " + " + numberTwo + "?: ");
 
            
            int user = scan.nextInt(); 
 
            if (user == answer) {
 
                points += 1;
 
                levelOne();
 
            } else {
 
                count += 1;
 
            }
 
 
 
        }
 
        return false;
 
    }
 
    public static boolean levelTwo() {
 
        int numberOne = random.getRandom();
 
        int numberTwo = random.getRandom();
 
        int answer = numberOne + numberTwo;
 
        int count = 0;
 
 
        while (points < 10 && count < 2) {
 
            System.out.println("What is " + numberOne + " + " + numberTwo + "?: ");

            int userChoice = scan.nextInt();
 
 
            if (userChoice == answer) {
 
                points += 1;
 
                levelTwo();
 
            } else {
 
                count += 1;
 
            }
 
 
 
        }
 
        return false;
 
    }
 
    public static boolean levelThree() {
 
        int numberOne = random.getRandom();
 
        int numberTwo = random.getRandom();
 
        int answer = numberOne - numberTwo;
 
        int count = 0;
 
 
        if (answer <= 0) {
 
            levelThree();
 
        }
 
        while (points < 15 && count < 2) {
 
            System.out.println("What is " + numberOne + " - " + numberTwo + "?: ");

            int userChoice = scan.nextInt();
 
 
            if (userChoice == answer) {
 
 
                levelThree();
 
            } else {
 
                count += 1;
 
            }
 
 
        }
 
        return false;
 
    }
 
 
}
