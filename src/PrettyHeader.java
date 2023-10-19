import java.util.Scanner;
public class PrettyHeader {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Message;
        System.out.println("Enter your message");
        Message = in.nextLine();
        SafeInput.prettyHeader(Message);
    }
}