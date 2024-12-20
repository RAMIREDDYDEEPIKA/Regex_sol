package sampleMavenProject.regexSol;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidationTest {

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "deepika@gmail.com",
            "hani.71@ibm.co",
            "hani_sri@community.org",
            "ashu66669@bridge.com"
    })
    public void testValidEmails(String email) {
        assertTrue(isValidEmail(email), "Expected email to be valid: " + email);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "hani-sri",
            "usha@.com",
            "@gmail.com",
            "sri567@bridge,com",
            "maha@ibm..com",
            "hashu@gmail"})
    public void testInvalidEmails(String email) {
        assertFalse(isValidEmail(email), "Expected email to be invalid, but it passed validation: " + email);
    }
}