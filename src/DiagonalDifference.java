public class DiagonalDifference {

    public int calculateDifference(int[][] matrix) {
        if (matrix == null) throw new IllegalArgumentException("Matrix cannot be null");
        if (matrix.length < 1) return 0;
        int primary = primaryDiagonal(matrix);
        int secondary = secondaryDiagonal(matrix);
        return - (primary - secondary);
    }

    public int primaryDiagonal(int[][] matrix) {
        int diagonalSum = 0;
        if (matrix.length >= 3){
            int row = matrix.length - 3;
            for (; row < matrix.length; row++) {
                for (int column = 0; column < 3; column++)
                    diagonalSum += matrix[row++][column];
            }
            return diagonalSum;
        }else throw new ArrayIndexOutOfBoundsException("Matrix must be 3 by 3 or greater");
    }

    public int secondaryDiagonal(int[][] matrix) {
        int diagonalSum = 0;
        if (matrix.length >= 3){
          int checker = matrix.length - 3;
            for (int row = matrix.length - 1; row > checker; row--) {
                for (int column = 0; column < 3; column++)
                    diagonalSum += matrix[row--][column];
            }
            return diagonalSum;
        }else throw new ArrayIndexOutOfBoundsException("Matrix must be 3 by 3 or greater");
    }
}
