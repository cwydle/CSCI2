package HW1;

public class Day extends Appointment{
    public Day(int day1, int month1, int year1, String description1) {
        super(day1, month1, day1, description1); 
    }
    public boolean occursOn(int day1, int month1, int year1, String description1) {
        if (getDay()==day1) {
            return true; 
        }
        else
        return false; 
    }
    public String toString() {
        return "[Day]"; 
    }
    
}
