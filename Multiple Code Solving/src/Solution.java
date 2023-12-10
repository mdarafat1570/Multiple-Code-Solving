import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");

        String s = scanner.nextLine();
        System.out.println("Enter your age:");

        int i = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your Number:");
        double d =scanner.nextDouble();

        scanner.close();

        System.out.println("String: " + s);
        System.out.println("int: " + i);
        System.out.println("double: " + d);
    }
}
