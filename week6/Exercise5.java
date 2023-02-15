import java.util.Scanner;

class ExerciseFive {

  public static void main(String[] args) {
    // initialize 3 by 3 array
    Scanner input = new Scanner(System.in);
    double[][] arrA = new double[3][3];
    double[][] arrB = new double[3][3];

    System.out.println(
      "Enter " +
      arrA.length +
      " Rows and " +
      arrA[0].length +
      " Columns for Array A"
    );
    System.out.println("---------------------------------------");

    // input the arrayA
    for (int row = 0; row < arrA.length; row++) {
      for (int col = 0; col < arrA[row].length; col++) {
        arrA[row][col] = input.nextDouble();
      }
    }
    System.out.println(
      "Enter " +
      arrA.length +
      " Rows and " +
      arrA[0].length +
      " Columns For Array B"
    );
    System.out.println("---------------------------------------");
    // input the arrayB

    for (int row = 0; row < arrB.length; row++) {
      for (int col = 0; col < arrB[row].length; col++) {
        arrB[row][col] = input.nextDouble();
      }
    }
    input.close();
    // Declare empty multiD array for store the sum of ArrA and ArrB
    double[][] storeSum = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

    // add up each element of 3 by 3 multi D Array
    for (int row = 0; row < arrA.length; row++) {
      for (int col = 0; col < arrA[row].length; col++) {
        storeSum[row][col] = arrA[row][col] + arrB[row][col];
      }
    }

    // Display the result
    double[][][] result = { arrA, arrB, storeSum };
    // Format the output as the expected result
    System.out.println("The matrices are added as follows:)");
    for (int i = 0; i < result[0].length; i++) {
      for (int j = 0; j < result.length; j++) {
        for (int k = 0; k < result[j][0].length; k++) {
          System.out.printf("%.1f ", result[j][i][k]);
        }
        // check if arrA is complete give the plus sign
        if (j == 0) {
          // check if middle display + sign
          if (i == 0) {
            System.out.print("   ");
          } else if (i == 1) {
            System.out.print("+  ");
          } else if (i == 2) {
            System.out.print("   ");
          }
        } else if (j == 1) {
          // check if middle display = sign
          if (i == 0) {
            System.out.print("   ");
          } else if (i == 1) {
            System.out.print("=  ");
          } else if (i == 2) {
            System.out.print("   ");
          }
        }
      }
      System.out.println();
    }
  }
}
