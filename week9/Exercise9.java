// group 4

public class Exercise9 {

    static void displayLargest(double... numbers) {

        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The largest number is " + result);

    }

    public static void main(String[] args) {

        displayLargest(34, 33, 23, 21, 56.5, 1, 99.99, 34, 52);

    }
}