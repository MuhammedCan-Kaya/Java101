import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int bakiye = 1000, secim, miktar, right = 3;

        do {
            System.out.print(" Kart Şifrenizi Tuşlayınız: ");
            int password = input.nextInt();
            switch (password) {
                case 1423:
                    do {
                        System.out.println(" Yapmak istediğiniz işlemi seçiniz. ");
                        System.out.println("1- Bakiye Sorgulama\n2- Para Çekme\n3- Para Yatırma\n4- Çıkış");
                        System.out.print(" Seçiminiz: ");
                        secim = input.nextInt();

                        switch (secim) {
                            case 1:
                                System.out.println(" Bakiyeniz: " + bakiye);
                                break;
                            case 2:
                                System.out.print(" Çekmek istediğiniz tutar: ");
                                miktar = input.nextInt();
                                if (bakiye >= miktar) {
                                    bakiye -= miktar;
                                } else {
                                    System.out.println(" Girdiğiniz tutar bakiyenizden yüksek olamaz. ");
                                }
                                break;
                            case 3:
                                System.out.print(" Yatırmak istediğiniz tutar: ");
                                miktar = input.nextInt();
                                bakiye += miktar;
                                break;
                            case 4:
                                System.out.print(" Çıkış yapılıyor. İyi günler dileriz. ");
                                right -= 3;
                        }
                    } while (secim != 4);
                    break;
                default:
                    System.out.println(" Şifrenizi yanlış girdiniz. Tekrar deneyiniz. ");
                    right--;
                    System.out.println(" Kalan Hak: " + right);
                    switch (right) {
                        case 0:
                            System.out.print(" Hakkınız bitmiş olup, kartınız bloke olmuştur. Banka ile görüşünüz.");
                    }
            }
        } while (right > 0);
    }
}
