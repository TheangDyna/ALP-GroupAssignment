import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int userInput, num = 0;

    for (int i = 0; i < 5; i++) { // loop 5 time
      System.out.print("input: ");
      userInput = input.nextInt();
      num = userInput; // asign new value
    }

    System.out.print("The last number you entered was a " + num); // display when loop break

    input.close();
  }
}
