import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Plz Enter the Month :");
//        int numbar = 22;
//        int number1 = 21;
//        int number2 = 23;
//        int number3 = 24;
//        String name = "Arafat khan";
//
//        if (numbar > number1){
//            System.out.println("this numar of big ");
//        }else if (number2 < number3){
//
//            System.out.println("this number of null");
//        }
//        else if (number2 < number3){
//
//            System.out.println("This numar of Big");
//
//        }else if (numbar + number1 < number3){
//
//            System.out.println("this numbar of Null");
//        }
//       else if (numbar>number3) {
//
//            System.out.println("this is big");
//
//        }else{
//            System.out.println(name+" This is Null");
//        }
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April ");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("invalid Number !");
        }
    }

}