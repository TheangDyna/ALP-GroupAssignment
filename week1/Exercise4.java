import java.util.Scanner;

public class Exercise4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int computer_num = 50;
    int userInput;
    int count = 0;

    System.out.print("Input: ");
    userInput = input.nextInt();
    count += 1;
    while (userInput != computer_num) {
      if (userInput > computer_num) {
        System.out.print("your guess is too high.\n");
      } else {
        System.out.print("your guess is too low.\n");
      }
      System.out.print("Input: ");
      userInput = input.nextInt();
      count += 1;
    }
    System.out.print("Well done, you took " + count + " attempt(s)");

    input.close();
  }
}
