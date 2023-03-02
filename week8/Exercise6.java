import java.util.Arrays;
import java.util.Scanner;

class Exercise6 {

    public static void main(String[] args) {

        // allow user to input 2 strings
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        input.close();

        // check anagram string
        System.out.println(isAnagram(str1, str2));

    }

    // method isAnagram allow parameter "str1, str"
    public static boolean isAnagram(String str1, String str2) {

        // remove space and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // check length of both strings
        if (str1.length() != str2.length()) {
            return false;
        }

        // compare characters in both strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
