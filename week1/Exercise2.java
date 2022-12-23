import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;
    int userInput;

    for (int i = 0; i < 5; i++) {
      System.out.print("input: ");
      userInput = input.nextInt();
      num = userInput;
    }
    System.out.print("The last number you entered was a " + num);

    input.close();
  }
}
