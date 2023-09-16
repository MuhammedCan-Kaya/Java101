import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kmtutari = 2.20, mesafe, minucret = 20, taksimetreucreti = 10, toplam;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Gidilen Mesafe(km): ");
        mesafe = scan.nextDouble();
        toplam = (mesafe*kmtutari + taksimetreucreti<= 20) ? minucret : kmtutari * mesafe +
                taksimetreucreti;
        System.out.print(" Ücret: " + toplam);
    }
}