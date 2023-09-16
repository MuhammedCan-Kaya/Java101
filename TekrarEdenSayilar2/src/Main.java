import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 2, 8, 6, 28, 14, 6, 8, 4, 6, 6, 2, 2, 0, 0, 0, 0};
        repeatNumbers(list);
    }

    public static boolean isHas(int[] arr, int value){ // true sonuç çıkarsa dizi içinde aynı sayıdan olduğu anlamına gelir. Koşul oluşturmamıza yarar.
        for (int i: arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void repeatNumbers(int[] arr){ // Bu fonksiyon ile listemizdeki elemanların tekrar edenleri ayıklıyor ve başka bir dizide topluyoruz.
        int[] addList = new int[arr.length];
        int x = 0;
        int[] repeat = new int[addList.length];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((i != j) && (arr[i] == arr[j])){
                    if(!isHas(addList, arr[i])){ //Tekrar eden elemanı bir kez dizi içerisine eklesin diye bu koşulu yazıyoruz.
                        addList[x++] = arr[i];
                    }
                    break;
                }
            }
        }

        for (int a = 0; addList[a] > 0; a++) { //Bir sayaç oluşturarak repeat dizisi içerisine tekrar eden elemanların kaç kez tekrar ettiğini yazıyoruz.
            int counter = 0;
            for(int b = 0; b < addList.length; b++){
                if(addList[a] == arr[b] && addList[a] != 0){
                    counter++;
                }
            }
            repeat[a] = counter;
        }

        for (int A = 0; A < addList.length; A++) {
            if(addList[A] != 0){ // Bu koşuldan dolayı listemizde 0 elemanından 1'den fazla varsa bile hesaplayamayacaktır. Dolayısı ile bu program 0'ları umursamaz.
                System.out.println(addList[A] + " sayısı " + repeat[A] + " kez tekrar edilmiş.");
            }
        }
    }
}