public class Exercise10 {
    public static void main(String[] args) {

        int[] array = { 1, 9, 9, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1, 25 };
        countOccurences(array); // call method

    }

    public static void countOccurences(int[] array) {

        int temp = 0, count[] = new int[100];

        // temp variable is for count array and keep track of number
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            count[temp]++;
        } // end of for loop

        for (int i = 1; i < count.length; i++) {

            if (count[i] > 0 && count[i] == 1) {
                System.out.printf("%d occurs %d time\n", i, count[i]);
            } else if (count[i] >= 2) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            }
        } // end of for loop
    }
}