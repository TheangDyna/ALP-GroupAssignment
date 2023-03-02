import java.util.Scanner;
import java.util.Arrays;

public class Exercise5 {
    // ask user for string and display the sorted string
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        input.close();
        String sorted = sort(s);
        System.out.println("Sorted string: " + sorted);
    }

    // method for sorted string
    public static String sort(String s) {
        String lowerString = s.toLowerCase();
        char[] arr = lowerString.toCharArray(); // Convert lowercase string to a character array
        Arrays.sort(arr); // sort alphabetical order
        return new String(arr); // create a new string
    }
}