import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double i, j, toplam, carpim, bolum, fark;
        int islem;
        Scanner scan = new Scanner(System.in);
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.print(" Lütfen yapmak istediğiniz işlemi (numara ile) seçiniz: ");
        islem = scan.nextInt();
        System.out.print(" İlk sayıyı giriniz: ");
        i = scan.nextDouble();
        System.out.print(" İkinci sayıyı giriniz: ");
        j = scan.nextDouble();

        switch (islem) {
            case 1:
                toplam = i + j;
                System.out.print(" Toplama sonucu: " + toplam );
                break;
            case 2:
                fark = i - j;
                System.out.print(" Çıkartma sonucu: " + fark);
                break;
            case 3:
                carpim = i * j;
                System.out.print(" Çarpma sonucu: " + carpim);
            default:
                bolum = i / j;
                System.out.print(" Bölme sonucu: " + bolum);
        }
    }
}