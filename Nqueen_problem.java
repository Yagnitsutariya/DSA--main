public class Nqueen_problem {
    public static boolean isSafe(char bord[][], int row, int col){
        //vertical up
        for(int i=row-1 ; i>=0; i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--, j--){
            if(bord[i][j]=='Q'){
                return false;
            }

        }
        //diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<bord.length; i--, j++){
            if(bord[i][j]=='Q'){
                return false;
            }

        }
        return true;
    }

    public static void queenPlace(char bord[][], int row){
        // Base case: If all rows are filled, print the board
        if(row == bord.length){
            printBord(bord);
            // count++; // Uncomment this line if you want to count the number of solutions
            return;
        }
        // Try placing a queen in each column of the current row
        for(int j = 0; j < bord.length; j++){
            // Check if it's safe to place the queen at bord[row][j]
            if(isSafe(bord, row, j)){
                // Place the queen
                bord[row][j] = 'Q';
                // Recur to place queens in the next row
                queenPlace(bord, row + 1);
                // Backtrack: Remove the queen
                bord[row][j] = 'x';
            }
        }
    }

    public static void printBord(char bord[][]){
        System.out.println("----------chess bord----------");
        // Print each row of the board
        for(int i = 0; i < bord.length; i++){
            for(int j = 0; j < bord.length; j++){
                System.out.print(bord[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 6;
        char bord[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                bord[i][j] = 'x' ;
            }
        }
        queenPlace(bord, 0);
        System.out.println("total ways is = "+count);
    }
    
}
