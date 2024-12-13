package regexDoc;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidNameFormat extends RuntimeException
{
    public InvalidNameFormat(String message){
        super(message);
    }
}
public class ValidateName
{
    public static void main(String[] args)
    {
        try {
            nameCheck();
        }
        catch (InvalidNameFormat e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void nameCheck()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName=sc.nextLine();
        String fregex="^[A-Z]{1}[a-zA-Z]{2,12}$";
        Pattern fpattern = Pattern.compile(fregex);
        if(fpattern.matcher(firstName).matches())
        {
            System.out.println(firstName);
        }
        else {
            throw new InvalidNameFormat(firstName+" is incorrect format check once");
        }

        System.out.println("Enter second name:");
        String secondName=sc.nextLine();
        String sregex="^[A-Z]{1}[a-zA-Z]{2,12}$";
        Pattern spattern = Pattern.compile(sregex);
        if(spattern.matcher(secondName).matches())
        {
            System.out.println(secondName);
        }
        else {
            throw new InvalidNameFormat(secondName+" is incorrect format check once");
        }
    }
}