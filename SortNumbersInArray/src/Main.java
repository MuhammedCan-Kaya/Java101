import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı sıralamak istersiniz: ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        for(int i = 0; i < arr.length; i++){
            System.out.print((i + 1) + ". Sayı: ");
            int number = input.nextInt();
            arr[i] = number;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}