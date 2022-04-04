public class LevelTwo extends Question{
    int a = 0;
    int b = 0; 

    public int level2() {
        int good = a + b; 
        int answer2 = good; 
        answer2 = checkAnswer(answer2); 
        return answer2; 
    }
}
