import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first fraction:");
        System.out.print("Numerator: ");
        int num1 = scanner.nextInt();
        System.out.print("Denominator: ");
        int den1 = scanner.nextInt();

        System.out.println("Enter the second fraction:");
        System.out.print("Numerator: ");
        int num2 = scanner.nextInt();
        System.out.print("Denominator: ");
        int den2 = scanner.nextInt();

        int commonDenominator = den1 * den2;
        int sumNumerator = (num1 * den2) + (num2 * den1);

        System.out.println("Sum of the fractions: " + sumNumerator + "/" + commonDenominator);

        scanner.close();
    }
}



 