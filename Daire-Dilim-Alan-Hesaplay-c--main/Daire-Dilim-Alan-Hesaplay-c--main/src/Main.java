import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14, r, a, dilimAlani;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Dairenin yarıçapı: ");
        r = scan.nextDouble();
        System.out.print(" Dairenin merkez açı ölçüsü: ");
        a = scan.nextDouble();
        dilimAlani = (pi * (r*r) * a) / 360;
        System.out.println(" Daire Diliminin Alanı: " + dilimAlani);
        
    }
}