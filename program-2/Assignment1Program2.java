import java.util.Scanner;

public class Assignment1Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get the base 10 number from the user ---
        System.out.print("Enter a base 10 number to convert: ");
        int number = Integer.parseInt(scanner.nextLine());

        // --- Get the target base from the user ---
        System.out.print("Enter the base to convert to (2-36): ");
        int targetBase = Integer.parseInt(scanner.nextLine());

        // --- Convert the number to the target base (no loops needed) ---
        String converted = Integer.toString(number, targetBase);

        // --- Calculate the largest 4-digit number representable in that base ---
        // A 4-digit number's max value in any base b is b^4 - 1
        // (each digit maxes out at b-1, e.g. 9999 in base 10 = 10^4 - 1)
        int largestFourDigit = (int) Math.pow(targetBase, 4) - 1;
        String largestFourDigitInBase = Integer.toString(largestFourDigit, targetBase);

        // --- Report results ---
        System.out.println(number + " in base " + targetBase + " is: " + converted);
        System.out.println("Largest 4-digit number in base " + targetBase + " is: "
                + largestFourDigit + " (base 10), which is "
                + largestFourDigitInBase + " in base " + targetBase);
    }
}
