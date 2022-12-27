public class Exercise10 {

  public static void main(String[] args) {
    double sum = 0.0;

    for (double i = 1.0; i <= 624.0; i++) { // loop 1 -> 624
      sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1)); // denominator first difference between sencond 1
    }

    System.out.println("Total: " + sum);
  }
}
