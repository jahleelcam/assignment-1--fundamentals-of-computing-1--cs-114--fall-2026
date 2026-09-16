import java.util.Random;
import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("   JJJJJJJJJJ       CCCCCCCCCC");
     System.out.println("          JJJ     CCC"); 
     System.out.println("          JJJ     CCC");
  System.out.println("          JJJ     CCCC");
  System.out.println("  JJJ     JJJ     CCC");
  System.out.println("  JJJJJJJ          CCCCCCCCCCC");
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-character string: ");
        String input = scanner.nextLine();

        // Drop first and last character, keep the middle
        String trimmed = input.substring(1, input.length() - 1);

        // Reverse what's left
        String result = new StringBuilder(trimmed).reverse().toString();

        // --- Part 2: Fahrenheit to Celsius ---
        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Celsius: " + celsius);

        // --- Part 3 (Step 4): Random number between 32 and 16384, inclusive ---
        Random random = new Random();
        int randomNumber = random.nextInt(16384 - 32 + 1) + 32;
        System.out.println("Your new string is " + celsius + result + randomNumber);
    }
    }
