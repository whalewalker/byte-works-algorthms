import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {
    private DiagonalDifference diagonalDifference;
    @BeforeEach
    void setUp() {
        diagonalDifference = new DiagonalDifference();
    }

    @AfterEach
    void tearDown() {
        diagonalDifference = null;
    }

    @Test
    void verifyThat_whenMatrixNotNull_ExceptionIsThrown(){
        int [][] matrix = null;
        assertThrows(IllegalArgumentException.class, ()-> diagonalDifference.calculateDifference(matrix));
    }

    @Test
    void verifyThat_whenMatrixLengthIsLesserThanOneReturnZero(){
        int [][] matrix = new int[0][0];
        assertEquals(0, diagonalDifference.calculateDifference(matrix));
    }

    @Test
    void canFindSumOfPrimaryDiagonal_ofThreeByThreeMatrix(){
        //Given
        int [][]matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int expected = 15;

        //When
        int actual = diagonalDifference.primaryDiagonal(matrix);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void canFindPrimaryDiagonal_whenMatrixColumnIs4by3(){
        //Given
        int [][]matrix = new int[][]{{3}, {11, 2, 4}, {4,5,6}, {10, 8, -12}};
        int expected = 4;

        //When
        int actual = diagonalDifference.primaryDiagonal(matrix);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void canFindSumOfSecondaryDiagonal_ofThreeByThreeMatrix(){
        //Given
        int [][]matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int expected = 15;

        //When
        int actual = diagonalDifference.secondaryDiagonal(matrix);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void canFindSecondaryDiagonal_whenMatrixIs4by3(){
        //Given
        int [][]matrix = new int[][]{{3}, {11, 2, 4}, {4,5,6}, {10, 8, -12}};
        int expected = 19;

        //When
        int actual = diagonalDifference.secondaryDiagonal(matrix);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void canFindDiagonalDifference_whenMatrixIs3by3(){
        //Given
        int [][]matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int expected = 0;

        //When
        int actual = diagonalDifference.calculateDifference(matrix);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void canFindDiagonalDifference_WhenMatrixIs4by3(){
        //Given
        int [][]matrix = new int[][]{{3}, {11, 2, 4}, {4,5,6}, {10, 8, -12}};
        int expected = 15;

        //When
        int actual = diagonalDifference.calculateDifference(matrix);

        //Assert
        assertEquals(expected, actual);
    }
}