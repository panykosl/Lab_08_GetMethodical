import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args) {
        int favNum = 0;
        double favDouble = 0;
        String prompt = "";

        Scanner in = new Scanner(System.in);

        prompt = "What is your favorite number";
        favNum = SafeInput.getInt(in, prompt);

        prompt = "What is your favorite double";
        favDouble = SafeInput.getDouble(in, prompt);

        System.out.println("Your favorite number is " + favNum);
        System.out.println("Your favorite double is " + favDouble);
    }
}