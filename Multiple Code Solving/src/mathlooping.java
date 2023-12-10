import java.util.Scanner;

public class mathlooping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i =0; i<num ;i++){

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            genaretmath (a,b,n);

        }
    }

    private static void genaretmath(int a, int b, int n) {

    int term = a;
      for (int i =0 ; i < n ; i++){

          term += Math.pow(2,i)*b;
           System.out.print(term+" ");
        }
     System.out.print("");
   }
}

