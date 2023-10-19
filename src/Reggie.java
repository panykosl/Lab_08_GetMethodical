import java.util.Scanner;
public class Reggie{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn;
        String mNumber;
        String menuChoice;
        ssn=SafeInput.getRegExString(in,"Enter your SSN in XXX-XX-XXXX","\\d{3}-\\d{2}-\\d{4}");
        mNumber=SafeInput.getRegExString(in, "Enter your M number", "(M|m)\\d{8}");
        menuChoice=SafeInput.getRegExString(in, "Enter your our choice from (OoSsVvQq)", "[OoSsVvQq]");

        System.out.println("\nYour SSN is : "+ssn);
        System.out.println("\nYour mNumber is : "+mNumber);
        System.out.println("\nYour menu choice is : "+menuChoice);
    }

}