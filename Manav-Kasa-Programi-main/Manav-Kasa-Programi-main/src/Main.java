import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, kilo, elmaFiyati, armutFiyati,
                domatesFiyati, patlicanFiyati, muzFiyati, toplam;
        System.out.print(" Kaç kilo armut? ");
        kilo = scan.nextDouble();
        armutFiyati = kilo * armut;
        System.out.print(" Kaç kilo elma? ");
        kilo = scan.nextDouble();
        elmaFiyati = kilo * elma;
        System.out.print(" Kaç kilo domates? ");
        kilo = scan.nextDouble();
        domatesFiyati = kilo * domates;
        System.out.print(" Kaç kilo patlıcan? ");
        kilo = scan.nextDouble();
        patlicanFiyati = kilo * patlican;
        System.out.print(" Kaç kilo muz? ");
        kilo = scan.nextDouble();
        muzFiyati = kilo * muz;
        toplam = elmaFiyati + armutFiyati + patlicanFiyati + muzFiyati + domatesFiyati;
        System.out.println(" Toplam Kasa Tutarı: " + toplam);


    }
}