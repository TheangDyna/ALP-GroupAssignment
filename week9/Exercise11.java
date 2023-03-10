public class Exercise11 {
    public static String verbose(long num) {
        // Check if the input out of rang
        if (num < 0 || num >= 1000000000) {
            return "Out of rang";
        }

        if (num == 0) {
            return "zero";
        }
        // Define array that map number to English word
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        // For Concatenate String
        StringBuilder result = new StringBuilder();

        // Below condition use to trim each part of number and translate it to English word
        if (num >= 100000000) {
            result.append(ones[(int) (num / 100000000)]).append(" hundred ");
            num %= 100000000;
        }

        if (num >= 20000000) {
            result.append(tens[(int) (num / 10000000)]).append(" ");
            num %= 10000000;
        }

        if (num >= 1000000) {
            result.append(ones[(int) (num / 1000000)]).append(" million ");
            num %= 1000000;
        }

        if (num >= 100_000) {
            result.append(ones[(int) (num / 100000)]).append(" hundred ");
            num %= 100000;
        }

        if (num >= 20000) {
            result.append(tens[(int) (num / 10000)]).append(" ");
            num %= 10000;
        }

        if (num >= 1000) {
            result.append(ones[(int) (num / 1000)]).append(" thousand ");
            num %= 1000;
        }

        if (num >= 100) {
            result.append(ones[(int) (num / 100)]).append(" hundred ");
            num %= 100;
        }

        if (num >= 20) {
            result.append(tens[(int) (num / 10)]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            result.append(ones[(int) num]);
        }

        // Remove White Space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Display result
        System.out.println(verbose(987123456));
    }
}
