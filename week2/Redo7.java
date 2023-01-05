import java.util.Scanner;

public class Redo7 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String num, beforeNum, afterNum;
    int ponitIndex, digit, intBefore, intAfter;
    StringBuffer binary = new StringBuffer();

    System.out.print("input: ");
    num = input.nextLine();

    ponitIndex = num.indexOf('.');

    if (ponitIndex < 0) {
      beforeNum = num;
      afterNum = "";
    } else {
      beforeNum = num.substring(0, ponitIndex);
      afterNum = num.substring(ponitIndex + 1);
    }

    intBefore = Integer.parseInt(beforeNum);
    intAfter = Integer.parseInt(afterNum);

    while (intBefore >= 1) {
      if (intBefore % 2 == 1) {
        intBefore = intBefore / 2;
        binary.append('1');
      } else {
        intBefore = intBefore / 2;
        binary.append('0');
      }
    }

    if (afterNum.length() > 0) {
      while (intAfter >= 1) {
        if (intAfter % 2 == 1) {
          intAfter = intAfter / 2;
          binary.append('1');
        } else {
          intAfter = intAfter / 2;
          binary.append('0');
        }
      }
    }

    System.out.print(binary.toString());
    input.close();
  }
}
