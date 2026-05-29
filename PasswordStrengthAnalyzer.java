import java.util.Scanner;

public class PasswordStrengthAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        // Length Check
        if(password.length() >= 8) {
            score++;
        } else {
            System.out.println("Use at least 8 characters.");
        }

        // Uppercase Check
        if(password.matches(".*[A-Z].*")) {
            score++;
        } else {
            System.out.println("Add at least one uppercase letter.");
        }

        // Lowercase Check
        if(password.matches(".*[a-z].*")) {
            score++;
        } else {
            System.out.println("Add at least one lowercase letter.");
        }

        // Number Check
        if(password.matches(".*\\d.*")) {
            score++;
        } else {
            System.out.println("Add at least one number.");
        }

        // Special Character Check
        if(password.matches(".*[!@#$%^&*()].*")) {
            score++;
        } else {
            System.out.println("Add at least one special character.");
        }

        // Strength Result
        if(score == 5) {
            System.out.println("Password Strength: Very Strong");
        }
        else if(score >= 4) {
            System.out.println("Password Strength: Strong");
        }
        else if(score >= 3) {
            System.out.println("Password Strength: Medium");
        }
        else {
            System.out.println("Password Strength: Weak");
        }

        sc.close();
    }
}