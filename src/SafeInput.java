import java.util.Scanner;
import java.util.regex.*;
public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" +prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt;
        while(true)
        {
            System.out.print("\n" +prompt + ": ");
            retInt = Integer.parseInt(pipe.nextLine());
            break;
        }
        return retInt;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble;
        while(true)
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retDouble = Double.parseDouble(pipe.nextLine());
            break;
        }
        return retDouble;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble;
        do{
            retDouble = getDouble(pipe, prompt);
        }while(retDouble < low || retDouble > high);
        return retDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt;
        do
        {
            retInt=getInt(pipe, prompt);
        }while(retInt < low || retInt > high);
        return retInt;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String str;
        while(true)
        {
            str=getNonZeroLenString(pipe, prompt);
            if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("Y"))
                break;
        }
        return str.equalsIgnoreCase("y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String str="";
        Pattern p = Pattern.compile(regEx);
        Matcher m;
        do
        {
            str=getNonZeroLenString(pipe, prompt);
            m= p.matcher(str);
        }while(!m.matches());
        return str;
    }

    public static void prettyHeader(String msg) {
        int sCount=60;
        while(sCount!=0)
        {System.out.print("*");
            sCount--;
        }
        System.out.println();
        int starsonLeft=(60-msg.length())/2;
        int left=30;
        while(left<=starsonLeft)
        {
            System.out.print("*");
            left++;
        }
        System.out.print(msg);
        int right=30;
        while(right<=starsonLeft)
        {
            System.out.print("*");
            right++;
        }
        System.out.println();
        sCount=60;
        while(sCount!=0)
        {
            System.out.print("*");
            sCount--;
        }
    }
}