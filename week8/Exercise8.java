import java.util.Scanner;

class Exercise8 {

    public static void main(String[] args) {

        // allow user to input password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = input.nextLine();
        input.close();

        // check checkValidPassword
        checkValidPassword(password);

    }

    // method checkValidPassword allow parameter "password"
    public static void checkValidPassword(String password) {

        // Check length
        if (password.length() != 8) {
            System.out.println("Invalid password: length must be exactly 8 characters");
            return;
        }

        // Check characters
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Invalid password: must consist of only letters and digits");
                return;
            }
        }

        // Check first character is a digit
        if (!Character.isDigit(password.charAt(0))) {
            System.out.println("Invalid password: must start with a digit");
            return;
        }

        // Check at least one uppercase letter
        boolean hasUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            System.out.println("Invalid password: must contain at least one uppercase letter");
            return;
        }

        // Password meets all requirements
        System.out.println("Valid password");
    }

}
