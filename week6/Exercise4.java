import java.util.Arrays;

class Exercise4 {

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
    for (int row = 0; row < vector.length; row++) {
      System.out.println(Arrays.toString(vector[row]));
    }

    // sort by insertion
    for (int row = 1; row < vector.length; row++) {  // loop throw row
      temp = vector[row];                            // temp = cuurent element
      j = row;                                       // j = nested loop index and use to break loop

      while (j > 0 && vector[j - 1][1] >= temp[1]) { // loop and check with current - 1
        if (vector[j - 1][1] == temp[1]) {           // if == check x
          if (vector[j - 1][0] >= temp[0]) {
            vector[j] = vector[j - 1];               // current = past, past = current
            vector[j - 1] = temp;
          }
        } else {
          vector[j] = vector[j - 1];                 // current = past, past = current
          vector[j - 1] = temp;
        }
        j--;                                         // update while loop
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
