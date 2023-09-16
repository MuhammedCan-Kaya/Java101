import java.util.Scanner;

public class Main {

    static int toplama (int a, int b) {
        return a + b;
    }

    static int çıkarma (int a, int b) {
        return a - b;
    }

    static int çarpma (int a, int b) {
        return a * b;
    }

    static int bölme (int a, int b) {
        return a / b;
    }

    static int usAlma (int a, int b) {
        int toplam = 1;
        for (int i = 1; i <= b; i++) {
            toplam *= a;
        }
        return toplam;
    }

    static int modAlma (int a, int b) {
        return a % b;
    }

    static String alan_Cevre (int a, int b) {
        int cevre = 2 * (a + b);
        int alan = a * b;
        return "Çevre: " + cevre + " Alan: " + alan;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String menu = "1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n5- Üssünü Alma\n6- Modunu ALma\n" +
                "7- Dikdörtgen Çevre ve Alan Hesaplama\n0- Çıkış";

        System.out.println(menu);

        while (true) {
            System.out.print(" Bir işlem seçiniz: ");
            int secim = input.nextInt();
            if (secim == 0) {
                System.out.println("Çıkış yapılıyor.");
                break;
            }
            System.out.print("1. Sayı: ");
            int a = input.nextInt();
            System.out.print("2. Sayı: ");
            int b = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Sonuç: " + toplama(a,b));
                    break;
                case 2:
                    System.out.println("Sonuç: " + çıkarma(a,b));
                    break;
                case 3:
                    System.out.println("Sonuç: " + çarpma(a,b));
                    break;
                case 4:
                    System.out.println("Sonuç: " + bölme(a,b));
                    break;
                case 5:
                    System.out.println("Sonuç: " + usAlma(a,b));
                    break;
                case 6:
                    System.out.println("Sonuç: " + modAlma(a,b));
                    break;
                case 7:
                    System.out.println(alan_Cevre(a,b));
                    break;
            }
        }
    }
}
