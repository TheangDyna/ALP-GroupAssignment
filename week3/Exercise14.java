import java.util.Arrays;
import java.util.Scanner;

class Exercise14 {

  public static void main(String[] args) {
    String[] words = { "program", "javascript", "computer" };

    int shuffle;

    String word, hangman;

    shuffle = (int) (Math.random() * words.length);
    word = words[shuffle];
    hangman = word.replaceAll("(?s).", "*");
    System.out.println(hangman);

    // allow user to input
    // Scanner input = new Scanner(System.in);
    // System.out.print("Input: ");
    // num = input.nextLine();
    // input.close();
  }
}
