class Exercise4 {
    // checks if a number is a prime number
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= (n / 2); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    // checks if a number is palindromic
    public static boolean isPalindrome(int n) {
        String numString = Integer.toString(n);
        String reversedString = new StringBuilder(numString).reverse().toString();
        return numString.equals(reversedString);
    }

    public static void generatePalindromicPrimes(int count) {
        int isTenPalindromicPrimes = 0; // count the number of PlaindromicPrimes
        int i = 2;
        while (isTenPalindromicPrimes < count) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                isTenPalindromicPrimes++;
                if (isTenPalindromicPrimes % 10 == 0) { // if we have generated 10 palindromic primes start a new line
                    System.out.println();
                }
            }
            i++; // check the next number
        }
    }

    public static void main(String[] args) {
        generatePalindromicPrimes(50); // generate the first 50 palindromic primes
    }
}
