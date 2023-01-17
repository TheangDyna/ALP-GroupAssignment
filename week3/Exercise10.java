import java.util.Scanner;

class Exercise10 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a hexadecimal number: ");
    String hex = input.nextLine().toUpperCase();
    input.close();

    // Convert the hexadecimal string to a number
    double num = 0;
    for (int i = 0; i < hex.length(); i++) {
      char c = hex.charAt(i);
      int digit;
      if (c >= '0' && c <= '9') {
        digit = c - '0';
      } else if (c >= 'A' && c <= 'F') {
        digit = c - 'A' + 10;
      } else {
        System.out.println("Invalid hexadecimal number");
        return;
      }
      num = num * 16 + digit;
    }
    System.out.println("Decimal value: " + num);
    System.out.println("Hexadecimal value: " + hex);
  }
}
