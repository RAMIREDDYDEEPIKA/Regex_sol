import java.util.regex.Pattern;

class InvalidFirstName extends Exception{
    public InvalidFirstName(String message){
        super(message);
    }
}
public class PasswordCheck
{
    public static void main(String[] args)
    {
        String[] passwords={"helLo@127","hello","ashuobe"};
        String[] firstNames={"Hanshika","hanshika"};
        String regex="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,}).*$";
        Pattern pattern=Pattern.compile(regex);
        String regex2="^([A-Z]{1})([a-zA-Z]{7}).*$";
        Pattern pattern2=Pattern.compile(regex2);
        for(String password:passwords)
        {
            if(pattern.matcher(password).matches()){
                System.out.println(password+" is valid password");
            }
            else{
                System.out.println(password+" is not valid password");
            }
        }
        try{
            firstNameCheck(firstNames,pattern2);
        }
        catch(InvalidFirstName e){
            System.out.println(e.getMessage());
        }
    }
    public static void firstNameCheck(String[] firstNames,Pattern pattern2) throws InvalidFirstName{
        for(String firstName:firstNames) {
            if (pattern2.matcher(firstName).matches()) {
                System.out.println(firstName + " is valid first name");
            }
            else{
                throw new InvalidFirstName("given "+firstName+" is not valid");
            }
        }
    }
}