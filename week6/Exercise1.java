// group 4

import java.util.Random;

class Exercise1 {

  public static void main(String[] args) {

    // create an empty 2D array 10*10
    char[][] array = new char[10][10];

    // Random object to generate random numbers between 0 and 25
        Random random = new Random(); 

        // loop all row and col
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                // adds the ASCII value of 'A' to get a random uppercase letter
                array[row][col] = (char) (random.nextInt(26) + 'A');
            }
        }

        // print
        // loop all row and col
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                // print each elements
                System.out.print(array[row][col] + " ");
            }

            // break line every 10 elemets
            System.out.println("");
        }
  }
}
