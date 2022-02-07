package HW1;

public class OneTime extends Appointment{

    public OneTime(int day1, int month1, int year1, String description1) {
        super(day1, month1, year1, description1); 
    }
    public String toString() {
        return "[OneTime]";
    }
    
}
