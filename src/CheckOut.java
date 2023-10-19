import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        String y = "";
        String n = "";
        double price=0;
        double totalCost=0;
        double originalPrice = 0;
        boolean cost = false;
        answer = String.valueOf(SafeInput.getYNConfirm(in, "Do you want enter a price of an item? [y/n]"));
        if(answer == n)
        {
            System.out.println("Come again!");
        }
        else;
        price = SafeInput.getRangedDouble(in, "Enter price of the item between .50 cents to $9.99 dollars", 0.5, 9.99);
        totalCost = price + originalPrice;
        System.out.printf("\nTotal cost of the items is" + "$%.2f%n", price);
        SafeInput.getYNConfirm(in, "Do you want enter a price of an item? (y/n)");
    }
}