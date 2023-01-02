import java.util.Scanner;

public class Exercise4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String num, wordNum = "";
    int len, digit;
    boolean isTwoDigit = false;

    String[] oneDigit = {
      "", //zero
      "One",
      "Two",
      "Three",
      "Four",
      "Five",
      "Six",
      "Seven",
      "Eight",
      "Nine",
    };
    String[] twoDigits = {
      "Ten",
      "Eleven",
      "Twelve",
      "Thirteen",
      "Fourteen",
      "Fifteen",
      "Sixteen",
      "Seventeen",
      "Eighteen",
      "Nineteen",
    };
    String[] multipleoftens = {
      "", // zero
      "", // ten
      "Twenty",
      "Thirty",
      "Forty",
      "Fifty",
      "Sixty",
      "Seventy",
      "Eighty",
      "Ninety",
    };

    System.out.print("input: ");
    num = input.nextLine();
    len = num.length();
    digit = len;

    for (int i = 0; i < len; i++) {
      if (digit == 3) {
        wordNum += oneDigit[num.charAt(i) - '0'] + " Hundred ";
      }
      if (digit == 2) {
        if (num.charAt(i) - '0' == 1) {
          isTwoDigit = true;
        } else {
          wordNum += multipleoftens[num.charAt(i) - '0'] + " ";
        }
      }
      if (digit == 1) {
        if(isTwoDigit){
          wordNum += twoDigits[num.charAt(i) - '0'];
        }else{
          wordNum += oneDigit[num.charAt(i) - '0'];
        }
      }
      digit--;
    }

    System.out.print(wordNum);

    input.close();
  }
}
