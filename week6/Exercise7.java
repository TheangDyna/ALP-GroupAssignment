import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Exercise7 {

  public static void main(String[] args) {
    String[][] quizItems = {
      { "Cambodia", "PhnomPenh" },
      { "Russia", "Moscow" },
      { "French", "Paris" },
      { "USA", "WashingtonDC" },
      { "Hungary", "Budapest" },
      { "NewZealand", "Wellington" },
      { "Germany", "Berlin" },
      { "Netherlands", "Amsterdam" },
      { "Japan", "Tokyo" },
      { "Mongolia", "Ulaanbaatar" },
    };
    // instantiate Scanner object
    Scanner input = new Scanner(System.in);
    // point to increase as the user answer correctly
    int point = 0;

    // generate random number without repetition values
    int size = quizItems.length; // Number of random number or how many random number we want to get
    ArrayList<Integer> noDuplicateVal = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      noDuplicateVal.add(i);
    }
    Collections.shuffle(noDuplicateVal); // randomize it

    // Loop through each row of the country
    for (int i = 0; i < quizItems.length; i++) {
      // random the country to ask
      int countries = noDuplicateVal.get(i);
      // -1 because it will not generate the random country two time the same
      for (int j = 0; j < quizItems[i].length - 1; j++) {
        // country
        String country = quizItems[countries][0].toLowerCase();
        // City
        String city = quizItems[countries][1].toLowerCase();

        System.out.print("What is the capital of " + country + "? ");
        String capitalInput = input.nextLine().toLowerCase().trim();
        capitalInput = capitalInput.replaceAll("\\s", ""); // remove the space

        if (capitalInput.equals(city)) {
          // increase the point
          point++;
          // push the already asked country
          System.out.println("Your answer is correct");
        } else {
          System.out.println("The correct answer should be " + city);
        }
      }
    }
    input.close();
    System.out.println("-------------------");
    // Output the point with the correct grammatically
    if (point == 1 || point == 0) {
      System.out.println("The correct count is " + point);
    } else {
      System.out.println("The correct counts are " + point);
    }
  }
}
