import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2010);
        System.out.println("Birth Year you Entered is : " + year);
        int month = SafeInput.getRangedInt(in, "Enter your month of birth", 1, 12);
        System.out.println("Month you entered is : " + month);
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 29);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 30);
                break;
        }
        System.out.println("Day you entered is :" + day);
        int hour = SafeInput.getRangedInt(in, "Enter your hour of birth", 1, 24);
        System.out.println("Hour you entered is :" + hour);
        int minute = SafeInput.getRangedInt(in, "Enter your minute of birth", 1, 59);
        System.out.println("Minute you entered is: " + minute);
        System.out.println("Your birthdate time is: " + day + "/" + month + "/" + year + " " + hour + ":" + minute);
    }
}