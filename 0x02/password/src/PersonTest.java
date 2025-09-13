import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.*;

public class PersonTest {

    private static Person person;

    @BeforeAll
    public static void setup() {
        person = new Person();
    }

    @ParameterizedTest
    public void check_user_valid() {
        assertTrue(person.checkUser("PaulMcCartney2"));
        assertTrue(person.checkUser("NeilArms2"));
    }

    @ParameterizedTest
    public void check_user_not_valid() {
        assertFalse(person.checkUser("Paul#McCartney"));
        assertFalse(person.checkUser("Neil@Arms"));
    }

    @ParameterizedTest
    public void does_not_have_letters() {
        assertFalse(person.checkPassword("123456789"));
        assertFalse(person.checkPassword("#$%1234"));
    }

    @ParameterizedTest
    public void does_not_have_numbers() {
        assertFalse(person.checkPassword("Abcabcdefgh@"));
        assertFalse(person.checkPassword("#hbtn@%tc"));
    }

    @ParameterizedTest
    public void does_not_have_eight_chars() {
        assertFalse(person.checkPassword("Abc@123"));
        assertFalse(person.checkPassword("12$@hbt"));
    }

    @ParameterizedTest
    public void check_password_valid() {
        assertTrue(person.checkPassword("abC123456$"));
        assertTrue(person.checkPassword("Hbtn@1234"));
        assertTrue(person.checkPassword("Betty@1#2"));
        assertTrue(person.checkPassword("Hbtn@123"));
    }
}
