import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double boy, kilo, bki;
        System.out.print(" Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scan.nextDouble();
        System.out.print(" Lütfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();
        bki = kilo / (boy*boy);
        System.out.println(" Beden Kitle İndeksiniz: " + bki);
    }
}