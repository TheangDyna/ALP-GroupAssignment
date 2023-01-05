import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String message, newMessage = "";

    System.out.print("input: ");
    message = input.nextLine();

    // Set first char as Capital letter
    newMessage += Character.toUpperCase(message.charAt(0));

    // Check if the last string is space capital the current character
    for (int i = 1; i < message.length(); i++) {
      if (message.charAt(i - 1) == ' ') {
        newMessage += Character.toUpperCase(message.charAt(i));
      } else {
        newMessage += message.charAt(i);
      }
    }

    System.out.println("new message: " + newMessage);
    input.close();
  }
}
