import java.util.Scanner;

class Exercise7 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Take input from the user
    System.out.print("Dear friend please enter a number: ");
    int userDecimal = input.nextInt();
    boolean keepWorking = true;
    int i;
    // empty binary array
    int[] binary = new int[10];
    while (keepWorking) {
      for (i = 0; i < binary.length; i++) {
        binary[i] = userDecimal % 2;
        userDecimal = userDecimal / 2;
        if ((userDecimal / 2) != 0) {
          keepWorking = false;
        }
      }
      // reverse array
      for (int j = i - 1; j >= 0; j--) {
        // output only start from the number 1
        System.out.print(binary[j]);
      }
    }
  }
}
