public class Person {
	public static boolean isEmailValid(String email) {
		if (!email.contains("@")) {
			return false;
		}

		if (email.length() > 50) {
			return false;
		}

		return true;
	}
}