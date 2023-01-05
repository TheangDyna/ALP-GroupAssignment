import java.util.Scanner;

public class Exercise8 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String num, beforeNum, afterNum;
    int ponitIndex, digit;
    double sum = 0.0;

    System.out.print("input: ");
    num = input.nextLine();

    ponitIndex = num.indexOf('.'); // find . index

    if (ponitIndex < 0) { // split the number between .
      beforeNum = num;
      afterNum = "";
    } else {
      beforeNum = num.substring(0, ponitIndex);
      afterNum = num.substring(ponitIndex + 1);
    }

    digit = beforeNum.length();

    for (int i = 0; i < beforeNum.length(); i++) { // calulate the before . binary
      sum += (beforeNum.charAt(i) - '0') * Math.pow(2, digit - 1);
      digit--;
    }

    if (afterNum.length() > 0) { // calulate the after . binary
      for (int i = 0; i < afterNum.length(); i++) {
        sum += (afterNum.charAt(i) - '0') * Math.pow(0.5, i + 1);
      }
    }

    System.out.print(sum);
    input.close();
  }
}
