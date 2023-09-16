import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter first number to act on: ");
        int num1 = input.nextInt();
        System.out.print(" Enter second number to act on: ");
        int num2 = input.nextInt();
        int i = 1;
        int ebob = 0;

        if (num1 > 0 && num2 > 0) {
            while (i <= num1 && i <= num2) {
                i++;
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
            }
            int ekok = (num1 * num2) / ebob;
            System.out.println(" EKOK: " + ekok);
            System.out.print(" EBOB: " + ebob);
        }
    }
}
