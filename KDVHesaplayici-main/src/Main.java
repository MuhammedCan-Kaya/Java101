import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kdvliUrunFiyati1, kdvliUrunFiyati2, urunFiyati = 0, kdv1 = 0.08, kdv2 = 0.18, kdvTutari1, kdvTutari2;

        System.out.print(" Ürün Fiyatı: ");
        urunFiyati = scan.nextDouble();
        kdvliUrunFiyati1 = urunFiyati + (urunFiyati * kdv1);
        kdvliUrunFiyati2 = urunFiyati + (urunFiyati * kdv2);
        kdvTutari1 = urunFiyati * kdv1;
        kdvTutari2 = urunFiyati * kdv2;

        boolean kosul = urunFiyati >= 1000;
        double fiyat = kosul ? kdvliUrunFiyati1 : kdvliUrunFiyati2;
        double kdvTutari = kosul ? kdvTutari1 : kdvTutari2;
        System.out.println(" KDV'li Ürün Fiyatı: " + fiyat);
        System.out.println(" Uygulanan KDV Tutarı : " + kdvTutari);

    }
}