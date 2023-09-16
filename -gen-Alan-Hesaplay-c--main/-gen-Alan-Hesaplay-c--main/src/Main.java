import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yukseklik, taban, alan;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Üçgenin Yüksekliği: ");
        yukseklik = scan.nextInt();
        System.out.print(" Üçgenin Taban Uzunluğu: ");
        taban = scan.nextInt();
        alan = (taban * yukseklik) / 2;
        System.out.print(" Üçgenin Alanı: " + alan);

    }
}