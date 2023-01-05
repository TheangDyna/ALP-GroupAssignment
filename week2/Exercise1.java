/*
Team: 4
ITE M3
output the longest String(word) in the sentence
 */

import java.util.Scanner;

class Exercise1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type a sentence my dear friend: ");
    String userInput = input.nextLine();
    // Slice words in sentence into array
    String[] words = userInput.split(" ");
    // Loop through array of word

    int max = words[0].length();

    // find the max length in all element
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > max) {
        max = words[i].length();
      }
    }
    // output that max length element as the String
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() == max) {
        System.out.println("The Longest word in this sentence is: " + words[i]);
      }
    }
    input.close();
  }
}
