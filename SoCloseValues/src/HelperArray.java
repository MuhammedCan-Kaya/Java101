public class HelperArray {

    public static void soCloseValuesOfNumber(int[] arr, int number) {

        int a = arr.length;
        int b = 0, c = 0;
        int[] temp1 = new int[a];
        int[] temp2 = new int[a]; //buradaki sorun fazla dizi slotu kullanıyor olmak sanırım.

        for (int i = 0; i < a; i++) {

            if (arr[i] < number) {
                temp1[b] = arr[i];
                b++;

            } else if (arr[i] > number) {
                temp2[c] = arr[i];
                c++;
            }
        }
        int min = temp1[0];
        int max = temp2[0];

        for (int x : temp1) {
            if (min < x) {
                min = x;
            }
        }
        System.out.println("En yakın küçük değer: " + min);

        for (int y : temp2) {
            if (max > y && y > number) {
                max = y;
            }
        }
        System.out.println("En yakın büyük değer: " + max);
    }
}
