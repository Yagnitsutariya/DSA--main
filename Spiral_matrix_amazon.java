public class Spiral_matrix_amazon {

    public static void spiral(int matrix[][]){
         int startcol = 0;
         int startrow = 0;
         int endcol = matrix[0].length-1;
         int endrow = matrix.length-1;

         while (startrow<=endrow&& startcol<=endcol) {

             //top
             for(int j=startcol ; j<=endcol ;j++){
                System.out.print(matrix[startrow][j]+" ");
             }
             //right
             for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endrow]+" ");
             }
             //bottom
             for(int j=endcol-1; j>=startcol; j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
             }
             //left
             for(int i=startcol-1; i>= startrow+1; i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
             }

             startcol++;
             startrow++;
             endcol--;
             endrow--;
         }
         System.out.println();
    }
    public static void main(String[] args) {
       int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       spiral(matrix);
    }
}

