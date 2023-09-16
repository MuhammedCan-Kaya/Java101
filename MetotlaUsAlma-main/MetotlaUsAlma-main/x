import java.util.Scanner;

public class Main {

    static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        }
        return taban * usAlma(taban,us-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Taban Değer: ");
        int taban = input.nextInt();
        System.out.print(" Üs Değeri: ");
        int us = input.nextInt();
        System.out.print(" Sonuç: ");
        System.out.println(usAlma(taban,us));
    }
}
