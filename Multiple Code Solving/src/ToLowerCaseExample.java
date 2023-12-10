import java.util.Scanner;

public class ToLowerCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String lowercaseString = userInput.toLowerCase();

        System.out.println("Original String: " + userInput);
        System.out.println("Lowercase String: " + lowercaseString);
    }
}

