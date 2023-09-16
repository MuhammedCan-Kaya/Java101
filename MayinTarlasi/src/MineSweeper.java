import java.util.*;

public class MineSweeper {
    public static void run(int line, int column) { // line column değerlerini kullanıcıya göre ayarla. 1 dediğinde 0. indeks algılansın.
        Scanner scan = new Scanner(System.in);
        String[][] board = new String[line][column];
        int range = column * line;
        String bomb = " * ";
        String unknownPoint = " - ";
        String[][] map = new String[line][column];
        int numberOfBombs = 0;

        for (int i = 0; i < range / 4; i++) {
            int x = (int) (Math.random() * line);
            int y = (int) (Math.random() * column);
            map[x][y] = " * ";
        }

        for (int e = 0; e < map.length; e++) {
            System.out.println();
            for (int f = 0; f < map[e].length; f++) {
                if(map[e][f] == null){
                    map[e][f] = " - ";
                    System.out.print(map[e][f]);
                }
                else{
                    System.out.print(map[e][f]);
                }
            }
        }

        for(int v = 0; v < map.length; v++){
            for(int c = 0; c < map[v].length; c++){
               if(map[v][c].equals(bomb)){
                   numberOfBombs++;
               }
            }
        }
        System.out.println();
        System.out.println("_____________________________________________");
        System.out.println();

        for (int e = 0; e < board.length; e++) {
            System.out.println();
            for (int f = 0; f < board[e].length; f++) {
                board[e][f] = " - ";
                System.out.print(board[e][f]);
            }
        }
        System.out.println();

        for (int a = 0; a < range; a++){
            System.out.println();
            int numberOfEmptyPoints = 0;
            System.out.println("Which would you like to choose of locations?");
            System.out.print("Row: "); // girilen değerleri kontrol eden koşullar yazılmalı.
            int row = scan.nextInt();
            System.out.print("Pillar: ");
            int pillar = scan.nextInt();
            if(row < 0 || pillar < 0){
                System.out.println("Please insert positive integers.");
                break;
            }
            String select = map[row][pillar];
            int counter = 0;

            if (select.equals(bomb)) {
                for(int u = 0; u < map.length; u++){
                    System.out.println();
                    for(int o = 0; o < map[u].length; o++){
                        System.out.print(map[u][o]);
                    }
                }
                System.out.println();
                System.out.println(" GAME OVER. ");
                break;
            }
            else if (select.equals(unknownPoint)){
                if(row - 1 != -1){
                    if(map[row - 1][pillar].equals(bomb)){
                        counter++;
                    }
                }
                if(row - 1 != -1 && pillar - 1 != -1){
                    if(map[row - 1][pillar - 1].equals(bomb)) {
                        counter++;
                    }
                }
                if(row - 1 != -1 && pillar + 1 != column){
                    if(map[row - 1][pillar + 1].equals(bomb)) {
                        counter++;
                    }
                }
                if(row + 1 != line) {
                    if(map[row + 1][pillar].equals(bomb)){
                        counter++;
                    }
                }
                if(row + 1 != line && pillar + 1 != column){
                    if(map[row + 1][pillar + 1].equals(bomb)){
                        counter++;
                    }
                }
                if(row + 1 != line && pillar - 1 != -1){
                    if(map[row + 1][pillar - 1].equals(bomb)){
                        counter++;
                    }
                }
                if(pillar + 1 != column){
                    if(map[row][pillar + 1].equals(bomb)){
                        counter++;
                    }
                }
                if(pillar - 1 != -1){
                    if(map[row][pillar - 1].equals(bomb)){
                        counter++;
                    }
                }
                switch (counter){
                    case 0:
                        board[row][pillar] = " 0 ";
                        break;
                    case 1:
                        board[row][pillar] = " 1 ";
                        break;
                    case 2:
                        board[row][pillar] = " 2 ";
                        break;
                    case 3:
                        board[row][pillar] = " 3 ";
                        break;
                    case 4:
                        board[row][pillar] = " 4 ";
                        break;
                    case 5:
                        board[row][pillar] = " 5 ";
                        break;
                    case 6:
                        board[row][pillar] = " 6 ";
                        break;
                    case 7:
                        board[row][pillar] = " 7 ";
                        break;
                    case 8:
                        board[row][pillar] = " 8 ";
                        break;
                }

                for (int e = 0; e < board.length; e++) {
                    System.out.println();
                    for (int f = 0; f < board[e].length; f++) {
                        System.out.print(board[e][f]);
                    }
                }
                System.out.println();
            }
            for(int l = 0; l < board.length; l++){
                for (int m = 0; m < board[l].length; m++){
                    if(board[l][m].equals(unknownPoint)){
                        numberOfEmptyPoints++;
                    }
                }
            }
            if(numberOfBombs == numberOfEmptyPoints){
                System.out.println("YOU WON THE GAME. CONGRATULATIONS!");
                break;
            }
        }
    }
}






