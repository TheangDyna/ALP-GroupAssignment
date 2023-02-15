class Exercise2 {

  public static void main(String[] args) {
    // static data
    int[][] matrix = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };

    // loop all cols 
    for (int col = 0; col < matrix.length; col++) {

      // [col][row] => [col - 1][row + 1] && break when col over
      for (
        int row = 0, colLen = col + 1;
        row < matrix[col].length && colLen > 0;
        row++, colLen--
      ) {
        System.out.print(matrix[col - row][row] + " ");
      }
      System.out.println("");
    }

    // loop the the below
    for (int col = 0, rowLen = 1; col < matrix.length - 1; col++, rowLen++) {

      // [matrix.length - 1] => continue from the first loop
      // [col][row] => [col - 1][row + 1] && break when matrix[matrix.length - 1].length - col - 1
      for (
        int row = 0, colLen = matrix.length;
        row < matrix[matrix.length - 1].length - col - 1 && colLen > 0;
        row++, colLen--
      ) {
        System.out.print(matrix[matrix.length - 1 - row][row + rowLen]+" ");
      }
      System.out.println("");
    }
  }
}
