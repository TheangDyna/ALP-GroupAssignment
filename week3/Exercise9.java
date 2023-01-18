// Group 4

import java.util.Scanner;

class Exercise9 {

  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // double num = input.nextDouble();
    // input.close();

    // // Convert the number to a hexadecimal string
    // String hex = "";
    // while (num > 0) {
    //   int digit = (int) (num % 16);
    //   char hexDigit;
    //   if (digit < 10) {
    //     hexDigit = (char) ('0' + digit);
    //   } else {
    //     hexDigit = (char) ('A' + digit - 10);
    //   }
    //   hex = hexDigit + hex;
    //   num = (int) (num / 16);
    // }
    // System.out.println("Hexadecimal value: " + hex);
    
    String wordL = "00000";
    int a = wordL.length() -1, b =wordL.length()-1;
    while (wordL.charAt(a) == '0') {
      wordL = wordL.substring(0, a);

    }
    System.out.println(wordL);
  }
}
