import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    
	public static void test_email_with_at_symbol() {
		assertTrue(Person.isEmailValid("email_test@domain.com"));
	}

	public static void test_email_without_at_symbol() { //testar_email_sem_arroba
		assertTrue(Person.isEmailValid("email_testdomain.com"));
	}

	public static void test_email_over_50_characters() {
		assertEqual(Person.isEmailValid("email_test_very_long_should_not_be_valid@domain.com"));
	}
}