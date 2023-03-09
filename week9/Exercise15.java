class Exercise15 {

    public static void main(String[] args) {
        int[][] array2D = {
                { 0, 1, 0, 1, 0, 1, 0 },
                { 0, 1, 0, 3, 1, 6, 1 },
                { 1, 0, 1, 5, 2, 5, 0 },
                { 1, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 0, 3, 1, 6, 1 },
                { 3, 0, 3, 1, 1, 6, 1 },
        };

        // Check if the array has four consecutive numbers
        boolean hasConsecutiveFour = isConsecutiveFour(array2D);

        // Print the result
        if (hasConsecutiveFour) {
            System.out.println("The array has four consecutive numbers.");
        } else {
            System.out.println("The array does not have four consecutive numbers.");
        }
    }

    public static boolean isConsecutiveFour(int[][] array2D) {
        int numRows = array2D.length;
        int numCols = array2D[0].length;

        // Check rows
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols - 3; j++) {
                if (array2D[i][j] == array2D[i][j + 1]
                        && array2D[i][j + 1] == array2D[i][j + 2]
                        && array2D[i][j + 2] == array2D[i][j + 3]) {
                    return true;
                }
            }
        }

        // Check columns
        for (int i = 0; i < numRows - 3; i++) {
            for (int j = 0; j < numCols; j++) {
                if (array2D[i][j] == array2D[i + 1][j]
                        && array2D[i + 1][j] == array2D[i + 2][j]
                        && array2D[i + 2][j] == array2D[i + 3][j]) {
                    return true;
                }
            }
        }

        // Check diagonals
        for (int i = 0; i < numRows - 3; i++) {
            for (int j = 0; j < numCols - 3; j++) {
                if (array2D[i][j] == array2D[i + 1][j + 1]
                        && array2D[i + 1][j + 1] == array2D[i + 2][j + 2]
                        && array2D[i + 2][j + 2] == array2D[i + 3][j + 3]) {
                    return true;
                }
                if (array2D[i][j + 3] == array2D[i + 1][j + 2]
                        && array2D[i + 1][j + 2] == array2D[i + 2][j + 1]
                        && array2D[i + 2][j + 1] == array2D[i + 3][j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
