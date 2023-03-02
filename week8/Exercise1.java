// group 4

import java.util.Scanner;

class Exercise1 {

    public static void main(String[] args) {

        // allow use to input sentence
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        input.close();

        // split the sentence to word and store in words array
        String[] words = split(sentence);

        // display result 
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        // local terminal display
        System.out.println();
    }

    // method to split allow parameter "sentence"
    public static String[] split(String sentence) {
        int count = 0;
        boolean inWord = false;

        // count the number of words in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    inWord = true;
                    count++;
                }
            } else {
                inWord = false;
            }
        }

        // create an array
        String[] words = new String[count];

        // extract the words from the sentence
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            } else if (sb.length() > 0) {
                words[index] = sb.toString();
                sb.setLength(0); // reset sb
                index++;
            }
        }

        // Add the last word, if any
        if (sb.length() > 0) {
            words[index] = sb.toString();
        }

        return words;
    }

}
