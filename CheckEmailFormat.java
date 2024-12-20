package sampleMavenProject.regexSol;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

public class CheckEmailFormat {

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @ParameterizedTest
    @CsvSource({
            "hari@bridge.com, true",
            "hari.sri@gmail.co, true",
            "prana_kolagani@community.org, true",
            "ashu.gmail@gmail.com,true",
            "hari34.com,true"
    })
    public void testValidEmails(String email,boolean expected) {
        assertEquals(expected,isValidEmail(email));
    }
}