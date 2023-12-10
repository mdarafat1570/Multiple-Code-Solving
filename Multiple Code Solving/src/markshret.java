import java.time.format.TextStyle;
import java.util.Scanner;

public class markshret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter student's marks");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter student's marks (out of 100): ");
                    int mark=scanner.nextInt();

                    switch (mark/10){
                        case 10:
                        case 9:
                            System.out.println("This mark Student is much then better");
                            break;
                        case 8:
                        case 7:
                        case 6:
                            System.out.println("This Student Mark is Good ");
                            break;
                        case 5:
                        case 4:
                            System.out.println("This Student is Pass ");
                            break;
                        case 3:
                        case 2:
                        case 1:
                        case 0:
                            System.out.println("This is Good as well");
                            break;
                        default:
                            System.out.println("Invalid marks entered.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice != 0);

        System.out.println("Program terminated. Goodbye!");
    }
}