import java.util.Scanner;

public class Question {

    Scanner in = new Scanner(System.in);
    private int answer, point, wrong;
    public Question() {
        answer = 0;
        point = 0;
        wrong = 0; 
    }
    public void setAnswer(int correct) {
        answer = correct; 
    }

    public void getPoint(int points) {
    point = points; 
}

    public void getWrong(int wrongAnswer) {
    wrong = wrongAnswer; 
}


    public int checkAnswer(int response){
        return response = answer; 
        
    }
    public int addPoint(){
        return point;
    }
    public int addWrong(){
        return wrong;
    }


}

