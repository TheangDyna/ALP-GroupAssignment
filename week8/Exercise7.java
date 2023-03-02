import java.util.Scanner;

class Exercise7 {

    public static void main(String[] args) {

        // allow user to input string and substring
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.nextLine();
        System.out.print("Enter the substring: ");
        String substring = input.nextLine();
        input.close();

        // remove substring form string
        System.out.println(removeSubstring(string, substring));

    }

    // method removeSubstring allow paramat "string, substring"
    public static String removeSubstring(String string, String substring) {
        if (substring.isEmpty()) {
            return string;
        }
        String result = string.replaceAll(substring, "");
        return result;
    }
}
