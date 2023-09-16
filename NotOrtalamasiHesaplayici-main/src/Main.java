import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner not = new Scanner(System.in);
        System.out.print(" Matematik Notunuzu Giriniz: ");
        mat = not.nextInt();
        System.out.print(" Kimya Notunuzu Giriniz: ");
        kimya = not.nextInt();
        System.out.print(" Fizik Notunuzu Giriniz: ");
        fizik = not.nextInt();
        System.out.print(" Müzik Notunuzu Giriniz: ");
        muzik = not.nextInt();
        System.out.print(" Türkçe Notunuzu Giriniz: ");
        turkce = not.nextInt();
        System.out.print(" Tarih Notunuzu Giriniz: ");
        tarih = not.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
        double ortalama = toplam / 6;

        boolean kosul = ortalama >= 60;
        String durum = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}