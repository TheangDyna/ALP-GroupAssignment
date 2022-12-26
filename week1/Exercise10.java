public class Exercise10 {

  public static void main(String[] args) {
    double summation = 0.0;
    for (double i = 1.0; i <= 624.0; i++) {
      summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
    }
    System.out.println("Summation: " + summation);
  }
}
