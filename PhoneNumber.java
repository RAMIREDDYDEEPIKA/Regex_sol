package regexDoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone number:");

        String phnNum=sc.nextLine();
        String regex="^(?:\\+91-)?[6-9]\\d{9}$";
        Pattern pattern =Pattern.compile(regex);

        String regex2="^\\d{10}$";
        Pattern pattern2=Pattern.compile(regex2);

        String regex3="^\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}$";
        Pattern pattern3=Pattern.compile(regex3);

        String regex4="^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
        Pattern pattern4=Pattern.compile(regex4);

        if(pattern.matcher(phnNum).matches()){
            System.out.println(phnNum);
        }
        else if (pattern2.matcher(phnNum).matches()) {
            System.out.println(phnNum);
        }
        else if (pattern3.matcher(phnNum).matches()) {
            System.out.println(phnNum);
        }
        else if (pattern4.matcher(phnNum).matches()) {
            System.out.println(phnNum);
        }
        else{
            System.out.println(phnNum+" invalid check once");
        }
    }
}