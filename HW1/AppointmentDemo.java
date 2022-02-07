package HW1;
//NAME CRYSTAL LUONG
import java.util.Scanner;


public class AppointmentDemo {
    public static void main(String[] args) {
        Appointment[] appointment = new Appointment[5];
        appointment[0] = new OneTime(25,8,2017,"Root Canal");
        appointment[1] = new Month(25,8,2017,"Teeth Cleaning");
        appointment[2] = new Day(31,1,2017,"Filling");
        appointment[3] = new OneTime(4,12,2017,"Crown");
        appointment[4] = new Month(7,4,2017,"Dentures");

        Scanner input = new Scanner(System.in); 

        System.out.println("Please insert the day of the appointment(1-31). ");
        int day = input.nextInt();
        System.out.println("Please insert the month of the appointment(1-12). ");
        int month = input.nextInt();
        System.out.println("Please insert the year of the appointment. ");
        int year = input.nextInt();
        System.out.println(day + " " + month + " " + year);

        for (int i=0; i <5;i++) {
            if (appointment[i].occursOn(day, month, year)==true){
                System.out.println("You have a " + appointment[i].getDesc() + " appointment on: " + day + ", " + month + ", " + year);
            }
            if (appointment[i].occursOn(day, month, year)==false){
                System.out.println("You do NOT have a " + appointment[i].getDesc() + " appointment on: " + day + ", " + month + ", " + year);
            }

        }

    }


}
