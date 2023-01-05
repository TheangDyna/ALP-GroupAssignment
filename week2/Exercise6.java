import java.util.Scanner;

public class Exercise6 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String num;
    String validChar = "0123456789ABCDEF."; // set the validate hexa charator
    boolean isHex = false;

    System.out.print("input: ");
    num = input.nextLine();

    for (int i = 0; i < num.length(); i++) { // loop all number
      isHex = false; // reset

      for (int j = 0; j < validChar.length(); j++) { // each number check with validate charator
        if (Character.toUpperCase(num.charAt(i)) == validChar.charAt(j)) {
          isHex = true;
        }
      }

      if (!isHex) { // break the when not hexa
        System.out.print("This is not a hexadecimal");
        break;
      }
    }

    if (isHex) { // if all of number is hexa print thank you
      System.out.print("Thank you");
    }

    input.close();
  }
}
