package regexDoc;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidEmailID extends RuntimeException
{
    public InvalidEmailID(String message)
    {
        super(message);
    }
}
public class ValidatingEmail
{
    public static void main(String[] args) {
        try {
            emailCheck();
        }
        catch (InvalidEmailID e) {
            System.out.println(e.getMessage());
        }
    }
    public static void emailCheck() throws InvalidEmailID
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email to validate:");
        String email = sc.nextLine();
        String regex = "^[a-zA-Z0-9]+[._-]*@[a-zA-Z]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if(pattern.matcher(email).matches())
        {
            System.out.println(email);
        }
        else{
            throw new InvalidEmailID(email+" is incorrected format check once");
        }
    }
}