import java.util.Arrays;

class ExerciseEleven {

  public static void main(String[] args) {
    // static vector data
    int[][] vector = {
      { 4, 2 },
      { 1, 7 },
      { 4, 5 },
      { 1, 2 },
      { 3, 1 },
      { 4, 1 },
    };

    int[] temp = new int[2];
    int j = 0;

    // output
    System.out.println("Orginal Arr");
    System.out.println("Sort Arr");
    for (int row = 0; row < vector.length; row++) {
      System.out.println(Arrays.toString(vector[row]));
    }

    // sort by insertion
    for (int row = 1; row < vector.length; row++) {
      temp = vector[row]; // key = cuurent element
      j = row; // j = index and use to break loop

      while (j > 0 && vector[j - 1][1] >= temp[1]) {
        if (vector[j - 1][1] == temp[1]) {
          if (vector[j - 1][0] >= temp[0]) {
            vector[j] = vector[j - 1];
            vector[j - 1] = temp;
          }
        } else {
          vector[j] = vector[j - 1];
          vector[j - 1] = temp;
        }
        j--;
      }
    }

    // test logic
    // temp = vector[1];
    // if (vector[1 - 1][1] > temp[1]) {
    //   vector[1] = vector[1 - 1];
    //   vector[1 - 1] = temp;
    // }

    // output
    System.out.println("Sort Arr");
    for (int row = 0; row < vector.length; row++) {
      System.out.println(Arrays.toString(vector[row]));
    }
  }
}
