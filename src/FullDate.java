import java.util.Scanner;
import java.lang.String;

public class FullDate {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String monthSpellOut = " ";

        System.out.println("Please enter the month (1-12): ");
        int month = input.nextInt();

        System.out.println("Please enter the day: ");
        int day = input.nextInt();

        System.out.println("Please enter the year (XXXX)");
        int year = input.nextInt();

        switch(month){
            case 1:
                monthSpellOut = "January";
                break;
            case 2:
                monthSpellOut = "February";
                break;
            case 3:
                monthSpellOut = "March";
                break;
            case 4:
                monthSpellOut = "April";
                break;
            case 5:
                monthSpellOut = "May";
                break;
            case 6:
                monthSpellOut = "June";
                break;
            case 7:
                monthSpellOut = "July";
                break;
            case 8:
                monthSpellOut = "August";
                break;
            case 9:
                monthSpellOut = "September";
                break;
            case 10:
                monthSpellOut = "October";
                break;
            case 11:
                monthSpellOut = "November";
                break;
            case 12:
                monthSpellOut = "December";
                break;
            default:
                System.out.println("You entered an invalid date. \nPlease follow the instructions next time.");
        }

        System.out.println("You entered " + monthSpellOut + " " + day + ", " + year + ".");

    }
}
