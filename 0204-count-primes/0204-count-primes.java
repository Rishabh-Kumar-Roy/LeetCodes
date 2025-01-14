class Solution {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        boolean[] primes = new boolean[n];  // Array to store prime numbers
        int count = 0;  // Count of prime numbers
        
        // Mark 2 as prime manually, since we are skipping even numbers.
        primes[2] = false;
        count++;  // Include 2 as prime
        
        // Start checking from odd numbers only, as even numbers > 2 are not prime.
        for (int p = 3; p < n; p += 2) {
            if (!primes[p]) {  // If p is prime
                count++;

                // Mark multiples of p as non-prime. Start at p * p, not p * 2.
                for (int i = p * p; i < n; i += p * 2) {
                    primes[i] = true;  // Mark as non-prime
                }
            }
        }
                
        return count;
    }
}