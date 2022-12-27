public class Exercise7 {

  public static void main(String[] args) {
    int count = 0;

    for (int i = 100; i <= 200; i++) { // loop 100 -> 200
      if (i % 6 == 0 || i % 5 == 0) { // find %5 or %6
        if (!(i % 6 == 0 && i % 5 == 0)) { // find not %5 and %6
          System.out.print(i + " ");
          count += 1;
          if (count % 10 == 0) { // break line every 10
            System.out.print("\n");
          }
        }
      }
    }
  }
}
