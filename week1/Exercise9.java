public class Exercise9 {

  public static void main(String[] args) {
    int sum;

    for (int i = 1; i < 10000; i++) { // loop 1 -> 10000
      sum = 0; // restart

      for (int j = 1; j < i; j++) { // loop each value again
        if (i % j == 0) { // find % i between loop
          sum += j;
        }
      }

      if (i == sum) System.out.println(i); // verify by sum
    }
  }
}
