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

    // init distance arr
    double[] distances = new double[points.length];

    // for(int row = 0; row < points.length; row++){
    //   for(int col = 0; col < points[row].length; col++){
    //     System.out.print(points[row][col]+ " ");
    //   }
    //   System.out.println("");
    // }

    // test logic
    double distance = Math.pow((points[1][0] - points[0][0]), 2);
    System.out.print(Math.sqrt(distance));
    
  }
}
