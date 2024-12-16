package sampleMavenProject.regexSol;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckEmailFormat {

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @ParameterizedTest
    @CsvSource({
            "hari@bridge.com",
            "hari.sri@gmail.co",
            "prana_kolagani@community.org",
            "ashu.gmail@gmail.com"})
    public void testValidEmails(String email) {
        assertTrue(isValidEmail(email), "Expected email to be valid: " + email);
    }

    @ParameterizedTest
    @CsvSource({
            "hari-email",
            "Sru67@.com",
            "@hari26.com",
            "usha@bridge,com",
            "ashu@gmail..com",
            "harika@gmail"
    })
    public void testInvalidEmails(String email) {
        assertFalse(isValidEmail(email), "Expected email to be invalid, but it passed validation: " + email);
    }
}