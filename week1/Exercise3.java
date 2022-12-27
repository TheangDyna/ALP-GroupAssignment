import java.util.Scanner;

public class Exercise3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char answer = 'y';
    int userInput, sum = 0;

    System.out.print("Input: "); // run once
    userInput = input.nextInt();
    sum += userInput;

    while (answer == 'y') { // loop when answer == 'y'
      System.out.print("y/n: ");
      answer = input.next().toLowerCase().charAt(0); // catch char and covert to lowcase
      if (answer == 'y') {
        System.out.print("Input: ");
        userInput = input.nextInt();
        sum += userInput;
      }
    }

    System.out.print("Total: " + sum); // disply when loop break

    input.close();
  }
}
