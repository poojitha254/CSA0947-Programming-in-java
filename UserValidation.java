import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username:");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is invalid.");
        }

        scanner.close();
    }

    // Method to check if the username is valid
    public static boolean isValidUsername(String username) {
        // Check if the username is at least 5 characters long
        if (username.length() < 5) {
            return false;
        }

        // Check if the username contains only letters and digits
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }

        return true;
    }
}
