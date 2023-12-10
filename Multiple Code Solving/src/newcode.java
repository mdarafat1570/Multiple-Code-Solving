import java.util.Scanner;

public class newcode {
    public static void main(String[] args) {
        System.out.println("Enter the your Numbar  :");

        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();

        for ( num =1 ; num<100; num++ ){

            System.out.println("print  number : "+num++);
        }


        if (num % 2 == 0){

            System.out.println("Apnar sonkhati holo jog");

        }else {
            System.out.println("apnar shongkha ti holo biog ");



        }
    }
}
