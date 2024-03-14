import java.util.Scanner;

public class ExceptionHandling {
    void eligibility(int a) {
        if (a < 18) {
            throw new ArithmeticException("You are not eligible to vote .");
        } else {
            System.out.println("You can vote .");
        }
    }

    public static void main(String args[]) throws ArithmeticException {
        ExceptionHandling ob = new ExceptionHandling();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        ob.eligibility(sc.nextInt());
        sc.close();
    }
}
