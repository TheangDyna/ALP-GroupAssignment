import java.util.Arrays;

class Exercise6 {

  public static void main(String[] args) {
    // static points data
    double[][] points = {
      { -1, 0, 3 },
      { -1, -1, -1 },
      { 4, 1, 1 },
      { 2, 0.5, 9 },
      { 3.5, 2, -1 },
      { 3, 1.5, 3 },
      { -1.5, 4, 2 },
      { 5.5, 4, -0.5 },
    };

    // temp variable
    int indexP1 = 0, indexP2 = 1;
    double nearest, distance;

    // do once to get default value
    nearest =
      Math.sqrt( // sqare root
        Math.pow((points[1][0] - points[0][0]), 2) + // (x2 - x1) ^ 2
        Math.pow((points[1][1] - points[0][1]), 2) + // (y2 - y1) ^ 2
        Math.pow((points[1][2] - points[0][2]), 2) // (z2 - z1) ^ 2
      );

    /*
     * point: A, B, C, D
     * posible distance: AB, AC, AD, BA, BC, BD, CA, CB, CD, DA, DB, DC
     * remove dublecate: AB, AC, AD, BC, BD, CD
     */

    for (int i = 0; i < points.length; i++) { // loop all row
      for (int j = i + 1; j < points.length; j++) { // calulate from i + 1
        distance =
          Math.sqrt(
            Math.pow((points[j][0] - points[i][0]), 2) +
            Math.pow((points[j][1] - points[i][1]), 2) +
            Math.pow((points[j][2] - points[i][2]), 2)
          );
        if (nearest >= distance) { // compare each distance
          indexP1 = i;
          indexP2 = j;
          nearest = distance;
        }
      }
    }

    // test logic
    // System.out.println(
    //   Math.sqrt(
    //     Math.pow((points[1][0] - points[0][0]), 2) +
    //     Math.pow((points[1][1] - points[0][1]), 2) +
    //     Math.pow((points[1][2] - points[0][2]), 2)
    //   )
    // );
    // System.out.println(Math.round(4.1151111 * 100.0) / 100.0);

    System.out.println(
      "from " +
      Arrays.toString(points[indexP1]) +
      " to " +
      Arrays.toString(points[indexP2]) +
      " have " +
      (Math.round(nearest * 100.0) / 100.0) +
      " is a nearest distance."
    );
  }
}
