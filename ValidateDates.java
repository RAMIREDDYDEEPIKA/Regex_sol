package regexDoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateDates
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a date to validate:");
        String date=sc.nextLine();

        String regex1="^\\d{2}/[a-z]{3,}/\\d{4}$";
        Pattern pattern1= Pattern.compile(regex1);

        String regex2="^[a-z]{3,}-\\d{2}-\\d{4}$";
        Pattern pattern2=Pattern.compile(regex2);

        String regex3="^\\d{4}\\.[a-z]{3,}\\.\\d{2}$";
        Pattern pattern3=Pattern.compile(regex3);

        if(pattern1.matcher(date).matches()){
            System.out.println(date);
        }
        else if (pattern2.matcher(date).matches()) {
            System.out.println(date);
        }
        else if (pattern3.matcher(date).matches()) {
            System.out.println(date);
        }
        else{
            System.out.println(date+" is incorrect format check once");
        }
    }
}