public class Exercise8 {

  public static void main(String[] args) {
    double sum = 0.0; // for + double

    for (double i = 1; i <= 97; i += 2) { // loop numerator 
      sum += i / (i + 2); // denominator difference between numerator 2
    }

    System.out.print("sum: " + sum);
  }
}
