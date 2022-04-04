
public class Main {
    public static void main(String[] args) {
        // int n3 = n1 + n2;
        LevelOne game1 = new LevelOne();
        LevelTwo game2 = new LevelTwo();
        LevelThree game3 = new LevelThree();
        int points = 0;
        while (points == 0) {

            System.out.println(points);
 
            if (points < 5) {
 
                System.out.println("Starting Level 1");
 
                game1.level1();
             //    if (incorrect = 2) {
             //        System.out.println("Sorry must retry.");
             //        levelOne(); 
             //    }
 
            } else if (points < 10) {
 
                System.out.println("Starting Level 2");
 
                game2.level2();
 
            } else if (points < 15) {
 
                System.out.println("Starting Level 3");
 
                game3.Level3();
 
            }
        }
    
}
}

