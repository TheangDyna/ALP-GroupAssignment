public class Exercise5 {

  public static void main(String[] args) {
    int n = 1;

    while (Math.pow(n, 3) < 11000) {
      n++;
    }

    if (n % 2 != 0) {
      n -= 1;
    }
    
    System.out.print(
      "e largest even integer n such that n^3 is less than 11000 is " + n + "."
    );
  }
}
