package sampleMavenProject.regexSol;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckEmail {

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @ParameterizedTest
    @MethodSource("validEmailProvider")
    public void testValidEmails(String email) {
        assertTrue(isValidEmail(email), "Expected email to be valid: " + email);
    }

    @ParameterizedTest
    @MethodSource("invalidEmailProvider")
    public void testInvalidEmails(String email) {
        assertFalse(isValidEmail(email), "Expected email to be invalid, but it passed validation: " + email);
    }

    static Stream<String> validEmailProvider() {
        return Stream.of(
                "prana678@gmail.com",
                "pooji.tha@bridge.co",
                "prana_kolagani@gmail.org",
                "hari.email@community.com"
        );
    }

    static Stream<String> invalidEmailProvider() {
        return Stream.of(
                "hari-sri",
                "usha@.com",
                "@gmail.com",
                "hashu@ibm,com",
                "nisha@gmail..com",
                "esha@gmail"
        );
    }
}