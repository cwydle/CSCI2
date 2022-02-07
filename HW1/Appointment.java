package HW1;

public class Appointment {
    private String description;
    private int day, month, year; 
 
    public Appointment (int day1, int month1, int year1, String description1){
        day = day1; 
        month = month1; 
        year = year1;
        description = description1;

    }

    public String getDesc() {
        return description; 
    }

    public void setDesc(String description) {
        this.description = description; 
    }
    public int getDay() {
        return day; 
    }
    public void setDay(int day) {
        this.day = day; 
    }
    public int getMonth() {
        return month; 
    }
    public void setMonth(int month) {
        this.month = month; 
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
    this.year = year;
    }

    public boolean occursOn(int day1, int month1, int year1) {
        if (getDay()==day1 && getMonth()==month1 && getYear()==year1) 
        return true;
        else
        return false; 
    }
    public String toString() {
        return day + ", " + month + ", " + year + ", " + description;
        
    }
}
