import java.util.Arrays; //Arrays.fill()

public class Exercise5 {

  public static void main(String[] args) {
    int locker = 456, player = 456, count = 0;
    boolean[] locked = new boolean[456]; // create array and set free space 456

    Arrays.fill(locked, false); // set all elements = false
 
    for (int i = 1; i <= player; i++) { // loop player
      for (int j = i; j <= locker; j += i) { // loop locker and skip by player index
        if (locked[j - 1] == false) {
          locked[j - 1] = true;
        } else {
          locked[j - 1] = false;
        }
      }
    }

    for (int i = 0; i < locked.length; i++) { // loop to display
      if (locked[i] == true) {
        if (count % 10 == 0) {
          System.out.println("");
        }
        System.out.print((i + 1) + " ");
        count++;
      }
    }
    System.out.print("\ntotal: " + count);
  }
}
