import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast CPR nummer): ");
        String ssn = scanner.nextLine();

        boolean isValid = isValidCPR(cpr);
        if (isValid) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }