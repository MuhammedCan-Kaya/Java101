import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Basamak sayısını giriniz: ");
        int digitCount = input.nextInt();

        if (digitCount > 0) {
            for (int a = 1, x = 1; a <= digitCount; a++, x+=2) {
                for (int i = 0; i < a; i++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * digitCount) - x; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }else {
            System.out.print(" Basamak sayısı 0'dan büyük olmalıdır. ");
        }
    }
}
