import java.util.Scanner;

public class PasswordStrengthTester {

    private static final int WEAK_PASSWORD = 1;
    private static final int MEDIUM_PASSWORD = 5;
    private static final int STRONG_PASSWORD = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        int strength = getPasswordStrength(password);
        System.out.println("The strength of your password is " + strength);
    }

    private static int getPasswordStrength(String password) {
        int length = password.length();
        int score = 0;

        if (length >= 8) {
            score += 2;
        }

        if (password.matches(".*[a-z].*")) {
            score += 1;
        }

        if (password.matches(".*[A-Z].*")) {
            score += 1;
        }

        if (password.matches(".*[0-9].*")) {
            score += 1;
        }

        if (password.matches(".*[!@#$%^&*()-+]+.*")) {
            score += 1;
        }

        return score;
    }
}
