// =========================
//      Latest version
// =========================

class Exercise1l {

    public static void main(String[] args) {
        // displays all twin primes less than 1200
        for (int i = 2; i < 1200; i++) {

            if (diplayTwinPrimes(i) && diplayTwinPrimes(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }

    // method
    public static boolean diplayTwinPrimes(long n) {
        // Twin primes are a pair of prime numbers that differ by 2
        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0)
                return false; // we dont want even number
        }
        return true;
    }
}