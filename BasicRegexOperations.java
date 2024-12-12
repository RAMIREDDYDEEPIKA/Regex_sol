import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidUserInput extends RuntimeException
{
    public InvalidUserInput(String message){
        super(message);
    }
}

public class BasicRegexOperations
{
    public static void main(String[] args)
    {
        try{
            checkingFirstName();
            checkingLastName();
            checkingEmail();
            checkingPassword();
            checkingPhnNum();
        }
        catch (InvalidUserInput e) {
            throw new InvalidUserInput(e.getMessage());
        }
    }

    public static void checkingFirstName() throws InvalidUserInput
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firstName:");
        String fregex="^[A-Z][a-zA-Z]{3,15}$";
        String firstName=sc.nextLine();
        Pattern fpattern=Pattern.compile(fregex);

        if (fpattern.matcher(firstName).matches()) {
            System.out.println(firstName);
        }
        else {
            throw new InvalidUserInput(firstName + " invalid user input check once");
        }

    }

    public static void checkingLastName() throws InvalidUserInput
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lastName:");
        String lregex="^[A-Z][a-zA-Z]*$";
        String lastName=sc.nextLine();
        Pattern lpattern=Pattern.compile(lregex);

        if(lpattern.matcher(lastName).matches()){
            System.out.println(lastName);
        }
        else{
            throw new InvalidUserInput(lastName+" is invalid check once");
        }
    }

    public static void checkingEmail() throws InvalidUserInput
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmailId:");
        String eregex="^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        String emailID=sc.nextLine();
        Pattern epattern=Pattern.compile(eregex);

        if (epattern.matcher(emailID).matches()) {
            System.out.println(emailID);
        }
        else {
            throw new InvalidUserInput(emailID + " is invalid check once");
        }
    }

    public static void checkingPassword() throws InvalidUserInput
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password:");
        String password=sc.nextLine();
        String wregex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[.!@#$%^&*]).{8,}$";
        Pattern wpattern=Pattern.compile(wregex);

        if (wpattern.matcher(password).matches()) {
            System.out.println(password);
        }
        else {
            throw new InvalidUserInput(password + " is invalid check once");
        }
    }

    public static void checkingPhnNum() throws InvalidUserInput
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Phone Number:");
        String pregex="^\\d{10}$";
        String phnNumber=sc.nextLine();
        Pattern ppattern=Pattern.compile(pregex);

        if (ppattern.matcher(phnNumber).matches()) {
            System.out.println(phnNumber);
        }
        else {
            throw new InvalidUserInput(phnNumber + " is invalid check once");
        }
    }
}