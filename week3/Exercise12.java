import java.util.Scanner;

class Exercise12 {

  public static void main(String[] args) {
    String num, leftNum, rightNum, readLeft = "", readRight = "", readNum = "";
    int ponitIndex, complete = 0, pointLen = 0, readLeftLen = 0, readRightlen =
      0;
    boolean isValid = true;

    String[] hexNum = {
      "0",
      "1",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "A",
      "B",
      "C",
      "D",
      "E",
      "F",
    };

    String[] binaryNum = {
      "0000",
      "0001",
      "0010",
      "0011",
      "0100",
      "0101",
      "0110",
      "0111",
      "1000",
      "1001",
      "1010",
      "1011",
      "1100",
      "1101",
      "1110",
      "1111",
    };

    // allow user to input
    Scanner input = new Scanner(System.in);
    System.out.print("Input: ");
    num = input.nextLine();
    input.close();

    // check validate input
    for (int i = 0; i < num.length(); i++) {
      if (
        !(num.charAt(i) == '0' || num.charAt(i) == '1' || num.charAt(i) == '.')
      ) {
        isValid = false;
        System.out.println("You entered an invalid number!");
        break;
      }
      if (num.charAt(i) == '.') {
        pointLen++;
      }
      if (pointLen > 1) {
        isValid = false;
        System.out.println("You entered an invalid number!");
        break;
      }
    }

    // if validate input
    if (isValid) {
      // slipt left and right of point
      ponitIndex = num.indexOf('.');
      if (ponitIndex < 0) {
        leftNum = num;
        rightNum = "";
      } else if (ponitIndex == 0) {
        leftNum = "0";
        rightNum = num.substring(ponitIndex + 1);
      } else {
        leftNum = num.substring(0, ponitIndex);
        rightNum = num.substring(ponitIndex + 1);
      }

      // check length
      String[] leftParts = new String[(int) Math.ceil(
        (double) leftNum.length() / 4
      )];

      // group the numbers in a set of 4
      for (
        int i = leftNum.length(), j = leftParts.length - 1;
        i > 0;
        i -= 4, j--
      ) {
        leftParts[j] = leftNum.substring(Math.max(0, i - 4), i);
      }

      // make a set of four
      if (leftParts[0].length() < 4) {
        complete = 4 - leftParts[0].length();
        for (int i = 0; i < complete; i++) {
          leftParts[0] = "0" + leftParts[0];
        }
      }

      // read left number
      for (int i = 0; i < leftParts.length; i++) {
        for (int j = 0; j < binaryNum.length; j++) {
          if (leftParts[i].equals(binaryNum[j])) {
            readLeft += hexNum[j];
          }
        }
      }

      // is right number
      if (rightNum.length() > 0) {
        // create space array length
        String[] rightParts = new String[(int) Math.ceil(
          (double) rightNum.length() / 4
        )];

        // group the numbers in a set of 4
        for (int i = 0, j = 0; i < rightNum.length(); i += 4, j++) {
          rightParts[j] =
            rightNum.substring(i, Math.min(rightNum.length(), i + 4));
        }

        // make a set of four
        if (rightParts[rightParts.length - 1].length() < 4) {
          complete = 4 - rightParts[rightParts.length - 1].length();
          for (int i = 0; i < complete; i++) {
            rightParts[rightParts.length - 1] =
              rightParts[rightParts.length - 1] + "0"; // error loop
          }
        }

        // read right number
        for (int i = 0; i < rightParts.length; i++) {
          for (int j = 0; j < binaryNum.length; j++) {
            if (rightParts[i].equals(binaryNum[j])) {
              readRight += hexNum[j];
            }
          }
        }
      }

      // clean answer
      readLeftLen = readLeft.length() - 1;
      while (readLeft.charAt(0) == '0') {
        if (readLeftLen < 1) {
          break;
        }
        readLeft = readLeft.substring(1);
        readLeftLen--;
      }

      if (rightNum.length() > 0) {
        readRightlen = readRight.length() - 1;
        while (readRight.charAt(readRight.length() - 1) == '0') {
          if (readRightlen < 1) {
            break;
          }
          readRight = readRight.substring(0, readRight.length()-1);
          readRightlen--;
        }
      }

      // add .
      if (rightNum.length() > 0) {
        readNum = readLeft + "." + readRight;
      } else {
        readNum = (readLeft);
      }

      // output
      System.out.println(readNum);
    }
  }
}
