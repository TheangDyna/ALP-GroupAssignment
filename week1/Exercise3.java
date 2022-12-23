import java.util.Scanner;

public class Exercise3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char answer = 'y';
    int sum = 0;
    int userInput;

    System.out.print("Input: ");
    userInput = input.nextInt();
    sum += userInput;
    while (answer == 'y') {
      System.out.print("y/n: ");
      answer = input.next().toLowerCase().charAt(0);
      if (answer == 'y') {
        System.out.print("Input: ");
        userInput = input.nextInt();
        sum += userInput;
      }
    }
    System.out.print("Total: " + sum);

    input.close();
  }
}
