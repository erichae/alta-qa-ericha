import java.util.Scanner;

public class bilanganPrima {

    public static void main(String[]args) {


        Scanner number = new Scanner(System.in);
        System.out.print("input number prime: ");
        int inputNumber = number.nextInt();

        boolean flag = true;
        for (int i = 1; i <= inputNumber / 2 ; ++i) {
            if(inputNumber % i == 0) {
                flag = false;
                break;
            }
        }

        if  (!flag)
            System.out.println("the number is prime number");
        else
            System.out.println("the number is not prime");
    }
}