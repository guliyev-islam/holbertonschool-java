public class Person {
    public boolean checkUser(String name) {
        if (!name.matches("[a-zA-Z0-9]+")) {
            return false;
        }


        return name.length() >= 8;
    }

    public boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        return password != null && password.matches(regex);
    }
}
