import java.util.Arrays;
import java.util.Random;

class Exercise13 {

    public static void main(String[] args) {
        char[][] array2D = {
                { 'A', 'A', 'A', 'A' },
                { 'B', 'B', 'B', 'B' },
                { 'B', 'B', 'B', 'B' },
                { 'C', 'C', 'C', 'C' }
        };

        // Shuffle the rows of the array
        shuffleRows(array2D);

        // Print the shuffled array useing For-each Loop
        for (char[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void shuffleRows(char[][] array2D) {
        Random random = new Random();

        // random and swap array2D.length times
        for (int i = array2D.length; i > 0; i--) {
            int j = random.nextInt(i);
            char[] temp = array2D[i - 1];
            array2D[i - 1] = array2D[j];
            array2D[j] = temp;
        }
    }

}