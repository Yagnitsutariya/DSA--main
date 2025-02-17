public class N_queen_place {
    public static void queenPlace(char bord[][], int row){
        if(row == bord.length){
            printBord(bord);
            return;
        }
        for(int j = 0; j<bord.length; j++){
            bord[row][j]='Q';
            queenPlace(bord, row+1);
            bord[row][j] = 'x';

        }
    }

    public static void printBord(char bord[][]){
        for(int i = 0; i<bord.length; i++){
            for(int j = 0; j<bord.length; j++){
                System.out.print(bord[i][j] + " x "  );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char bord[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                bord[i][j] = 'x' ;
            }
        }
        queenPlace(bord, 0);
    }
    
}