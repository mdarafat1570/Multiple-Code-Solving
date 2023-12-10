package problemSolvehackerrenk;

import java.util.Scanner;

public class scannerproblemSolve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your name : ");
        String MyName = scanner.next();
        System.out.println("Enter the your Age : ");
        int MyAge = scanner.nextInt();
        System.out.println("Enter the your Number : ");
        String MyNumber = scanner.next();
        System.out.println("Enter the your Adders : ");
        String MyAdders = scanner.next();
        scanner.close();

        System.out.println("Your Information is");
        System.out.println("Name : "+MyName);
        System.out.println("Age : "+MyAge);
        System.out.println("Number : "+MyNumber);
        System.out.println("Adders : "+MyAdders);



    }
}


