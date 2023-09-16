import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Please set an upper limit: ");
        int limit = input.nextInt(), k=1, total = 0, howMany_k = 0;

        while (k < limit && limit > 0) {
            k++;
            if(k % 12 == 0) {
                total += k;
                howMany_k++;
            }
        }
        double average = total / howMany_k;
        System.out.print(" Arithmetic Mean: " + average);
    }
}
