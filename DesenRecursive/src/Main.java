import java.util.Scanner;

public class Main {
    static String desen (int deger, int ilkDeger, boolean dur) {
        System.out.println(deger);
        if (deger < 0 || deger == 0 || !dur) {
            dur = false;
            if (deger != ilkDeger) {
                return desen(deger + 5, ilkDeger, dur);
            }else {
                return "Dizi sonu.";
            }
        }else {
            return desen(deger - 5, ilkDeger, dur);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int deger = input.nextInt();
        System.out.print(desen(deger,deger,true));
    }
}