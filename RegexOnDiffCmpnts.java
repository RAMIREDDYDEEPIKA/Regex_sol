package sampleMavenProject.regexSol;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;



//parameterizedTest
//valueSource
//csvSource
//methodSource


public class RegexOnDiffCmpnts
{

    @Test
    public void checkingFirstName()
    {
        String fregex="^[A-Z]{1}[a-zA-Z]{2,14}$";
        String firstName="Hani";
        Pattern fpattern=Pattern.compile(fregex);
        Matcher matcher=fpattern.matcher(firstName);
        assertTrue(matcher.matches(),firstName);
    }

    @Test
    public void checkingLastName()
    {
        String lregex="^[A-Z][a-zA-Z]*$";
        String lastName="Sri";
        Pattern lpattern=Pattern.compile(lregex);
        Matcher matcher=lpattern.matcher(lastName);
        assertTrue(matcher.matches(),lastName);
    }

    @Test
    public void checkingEmail()
    {
        String eregex="^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        String emailID="hani@gmail.com";
        Pattern epattern=Pattern.compile(eregex);
        Matcher matcher=epattern.matcher(emailID);
        assertTrue(matcher.matches(),emailID);
    }

    @Test
    public void checkingPassword()
    {
        String password="Deepa@1234";
        String wregex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[.!@#$%^&*]).{8,}$";
        Pattern wpattern=Pattern.compile(wregex);
        Matcher matcher=wpattern.matcher(password);
        assertTrue(matcher.matches(),password);
    }

    @Test
    public void checkingPhnNum()
    {
        String pregex="^\\d{10}$";
        String phnNumber="9876543293";
        Pattern ppattern=Pattern.compile(pregex);
        Matcher matcher=ppattern.matcher(phnNumber);
        assertTrue(matcher.matches(),phnNumber);
    }
}