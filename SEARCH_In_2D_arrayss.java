public class SEARCH_In_2D_arrayss {
    public static boolean search(int matrix[][],int key){
        int row = 0, col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at("+row+" " +col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix [][]={{12,13,14},{15,16,17},{18,19,20}};
        search(matrix, 16); 
    }
}
