import java.util.*;

public class Exercise2l {

    public static void main(String[] args) {
        // call method
        generatePalindromes();
    }

    public static void generatePalindromes() {

        Scanner user_Input = new Scanner(System.in);
        System.out.print("Enter the number of even palindromes you want the program to generate: ");
        int num_Input = user_Input.nextInt();
        user_Input.close();
        for (int i = 0; i <= num_Input; i++) {

            if (i % 2 == 0) { // check even number
                int tmp = i; // tmp store even number
                int n = tmp;
                int rev = 0;

                while (n > 0) {

                    int digit = n % 10;
                    rev = (rev * 10) + digit;
                    n = n / 10;

                }

                if (rev == i) {
                    System.out.print(i + " "); // dislay even palindrome
                }
            }

        } // end for loop
    } // end method generatePalindromes
}