public class Exercise9 {

  public static void main(String[] args) {
    int sum;

    for (int i = 1; i < 10; i++) {
      sum = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          sum += j;
        }
        System.out.println(j + " <= " + i);
      }

      if (i == sum) System.out.println(i);
    }
  }
}