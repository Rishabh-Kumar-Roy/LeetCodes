class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // No primes less than 2
        }

        // Sieve of Eratosthenes: Create a boolean array to mark primes
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Initialize all as prime
        }

        // Mark non-prime numbers
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // Mark multiples as non-prime
                }
            }
        }

        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}