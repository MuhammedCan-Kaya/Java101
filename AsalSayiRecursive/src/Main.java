import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Üssü alınacak sayı: ");
        int tabanSayi = input.nextInt();
        System.out.print(" Üs: ");
        int usSayi = input.nextInt();
        int ilkdeger = tabanSayi;

        for (int i = 1; i < usSayi; i++) {
            tabanSayi *= ilkdeger;
        }
        System.out.print(ilkdeger + " ^ " + usSayi + " = " + tabanSayi);
    }
}