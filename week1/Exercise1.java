import java.util.Scanner;

public class Exercise1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput, sum = 0;

    while (sum < 50) {
      System.out.print("input: ");
      userInput = input.nextInt();
      sum += userInput;
    }
    System.out.print("total: " + sum);

    input.close();
  }
}
