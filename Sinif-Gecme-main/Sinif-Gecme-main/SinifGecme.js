import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik, dersSayisi = 5;

        System.out.print(" Matematik Notunuz: ");
        mat = scan.nextInt();
        System.out.print(" Kimya Notunuz: ");
        kimya = scan.nextInt();
        System.out.print(" Fizik Notunuz: ");
        fizik = scan.nextInt();
        System.out.print(" Türkçe Notunuz: ");
        turkce = scan.nextInt();
        System.out.print(" Müzik Notunuz: ");
        muzik = scan.nextInt();

        if(mat < 0 || mat > 100) {
            dersSayisi--;
            mat = 0;
        }

        if(kimya < 0 || kimya > 100) {
            dersSayisi--;
            kimya = 0;
        }

        if(fizik < 0 || fizik > 100) {
            dersSayisi--;
            fizik = 0;
        }

        if(turkce < 0 || turkce > 100) {
            dersSayisi--;
            turkce = 0;
        }

        if(muzik < 0 || muzik > 100) {
            dersSayisi--;
            muzik = 0;
        }
        
        double ortalama = (mat+fizik+kimya+turkce+muzik) / dersSayisi;

        if (ortalama <= 55) {
            System.out.print(" Sınıfı geçemediniz. Ortalamanız: " + ortalama );
        }else {
            System.out.println(" Sınıfı geçtiniz. Ortalamanız: " + ortalama );

        }
    }
}
