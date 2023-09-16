import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3} , {4,5,6}};
        int[][] transpoz = new int[3][2];

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                transpoz[j][i] = matris[i][j];
            }
        }
        for (int a = 0; a < transpoz.length; a++){
            for (int b = 0; b < transpoz[a].length; b++){
                System.out.print(transpoz[a][b] + " ");
                if (b==1){
                    System.out.println();
                }
            }
        }
    }
}