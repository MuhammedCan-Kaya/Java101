import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 2, 8, 4, 6, 8, 10, 32, 2, 4, 8, 6};
        repeatEvenNumbers(list);
    }

    public static boolean isHas(int[] arr, int value){ // true sonuç çıkarsa dizi içinde aynı sayıdan olduğu anlamına gelir.
        for (int i: arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void repeatEvenNumbers(int[] arr){
        int[] addList = new int[arr.length];
        int x = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)){ //arr dizisinin bütün elemanlarını gezerek 2'nin katı olanları ve tekrar edenleri addList'e ekler.
                    if(!isHas(addList, arr[i])){ //addList'in içinde aynı sayı yoksa ekler. Eğer sayı varsa, "true" sonucu "false" yapar ve koşul gerçekleşmez.
                        addList[x++] = arr[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Dizi içinde tekrar eden çift sayılar: ");
        for (int value : addList){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
    }
}