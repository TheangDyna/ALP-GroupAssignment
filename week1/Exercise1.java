// Group 4

import java.util.Scanner; // Scanner

public class Exercise1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int userInput, sum = 0;

    while (sum < 50) { // loop when sum < 50
      System.out.print("input: ");
      userInput = input.nextInt();
      sum += userInput;
    }

    System.out.print("total: " + sum); // display when loop break

    input.close(); // close scan
  }
}
