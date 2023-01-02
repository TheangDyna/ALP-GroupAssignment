import java.util.Scanner;

public class Exercise6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = 0, userInput, total = 0, negetiveTotal = 0, positiveTotal = 0;
    float average = 0.0f;

    System.out.print("Input: "); // run once
    userInput = input.nextInt();
    count++;
    total += userInput;

    if(userInput > 0){ // check (+) or (-) and update
      positiveTotal++;
    }else if(userInput < 0){
      negetiveTotal++;
    }

    while (userInput != 0) { // loop when userInput != 0
      System.out.print("Input: ");
      userInput = input.nextInt();
      count++;
      total += userInput;
      if(userInput > 0){
        positiveTotal++;
      }else if(userInput < 0){
        negetiveTotal++;
      }
    }

    average = total/count;

    System.out.println("Total of negative: " + negetiveTotal);
    System.out.println("Total of positive: " + positiveTotal);
    System.out.println("Total: " + total);
    System.out.print("Average: " + average);


    input.close();
  }
}
