public class Exercise7 {

  public static void main(String[] args) {
    int start = 100, end = 200, count = 0;

    for (int i = start; i <= end; i++) {
      if (i % 6 == 0 || i % 5 == 0) {
        if (!(i % 6 == 0 && i % 5 == 0)) {
          System.out.print(i + " ");
          count += 1;
          if (count % 10 == 0) {
            System.out.print("\n");
          }
        }
      }
    }
  }
}
