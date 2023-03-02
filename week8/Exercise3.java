import java.util.Scanner;

class Exercise3 {

    public static void main(String[] args) {

        // allow use to input number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of even palindromes you want the program to generate: ");
        int count = input.nextInt();
        input.close();

        // genarate palindromes usign method
        int[] palindromes = generatePalindromes(count);

        // display result genarate
        for (int i = 0; i < palindromes.length; i++) {
            System.out.print(palindromes[i] + " ");
        }

        // local terminal display
        System.out.println();
    }

    // method generatePalindromes allow paramat "count"
    public static int[] generatePalindromes(int count) {
        int[] result = new int[count];
        int num = 0;
        int i = 0;

        // loop through count from user
        while (i < count) {

            // only even number
            if (num % 2 == 0) {

                // num start 0 from to infinity
                String numStr = Integer.toString(num);

                // don't care one digit palindrome
                if (numStr.length() == 1) {
                    result[i] = num;
                    i++;

                } else {

                    // check the same backward as forward
                    if (numStr.charAt(0) == numStr.charAt(numStr.length() - 1)) {
                        result[i] = num;
                        i++;
                    }
                }
            }
            num++;
        }
        return result;
    }
}
