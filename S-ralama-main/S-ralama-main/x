import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Kaç tane sayı girilecek: ");
        int i = 0,j = 0;
        int n = input.nextInt();

        while (n > 0) {
            System.out.print(" Sayı: ");
            int a = input.nextInt();
            System.out.print(" Sayı: ");
            int b = input.nextInt();
            n -= 2;

            if (a > b) {
                i = a;
                j = b;
            }else {
                i = b;
                j = a;
            }
        }
        System.out.println(" En büyük sayı: " + i);
        System.out.print(" En küçük sayı: " + j);
    }
}
