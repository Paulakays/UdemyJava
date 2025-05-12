public class RethrowingExceptions {
    public static void main(String[] args) {
        try {
            handleUserRegistration("Paula", "12345");
            handleUserRegistration("James", "");

        }catch(Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void handleUserRegistration(String username, String password) throws Exception {

        try {
            //Calling the method to handle its exception
            validatePassword(password);
            System.out.println("User: " + username + " registered successfully");

            //Throws an exception when the password is null or empty
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            throw new Exception("Registration failed for user: " + username, e);
        }
    }

    public static void validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
    }
}
