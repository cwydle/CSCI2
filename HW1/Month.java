package HW1;


public class Month extends Appointment{

    public Month(int day1, int month1, int year1, String description1) {
        super(day1, month1, year1, description1);
    }
    public boolean occursOn(int day1, int month1, int year1, String description1) {
        if (getMonth()==month1) {
            return true; 
        }
        else
        return false; 
    }
    public String toString() {
        return "[Month]"; 
    }
    
}
