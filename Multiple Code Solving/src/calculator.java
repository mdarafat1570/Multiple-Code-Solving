import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st Number : ");
        double a =scanner.nextInt();

        System.out.println("Enter the 2nd Numbar :");
        double b =scanner.nextInt();


        System.out.println("Select An opration :");
        System.out.println("1 : +(Addition)");
        System.out.println("2 : -(Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");


        int oparetor = scanner.nextInt();

        double  result = 0.0;

        switch (oparetor){

            case 1:
                result= a+b ;
                break;
            case 2 :
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                result = a/b;
                break;
            case 5:
                result = a%b;
                break;
            default:
                System.out.println("invalid Calculation on your number !");
        }

        System.out.println("Result :" + result);





    }
}
