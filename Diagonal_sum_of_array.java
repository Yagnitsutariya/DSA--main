public class Diagonal_sum_of_array {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+= matrix[i][i];
            if(i!= matrix.length-1-i)
            sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arrayss[][] ={{1,2,3},{4,5,6,},{7,8,9}};
        
        System.out.println("sum is"+ diagonalSum(arrayss));

    }
}

