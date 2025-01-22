import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Count frequencies using a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Convert the int array to Integer array
        Integer[] numsArray = Arrays.stream(nums)
                                     .boxed()
                                     .toArray(Integer[]::new);

        // Sort the array based on frequency using a custom comparator
        Arrays.sort(numsArray, (a, b) -> {
            int freqA = freqMap.get(a); // Frequency of 'a'
            int freqB = freqMap.get(b); // Frequency of 'b'

            if (freqA == freqB) {
                return b - a; // If frequencies are the same, sort by value in descending order
            }
            return freqA - freqB; // Otherwise, sort by frequency in ascending order
        });

        // Convert the Integer array back to int array
        for (int i = 0; i < numsArray.length; i++) {
            nums[i] = numsArray[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        Solution solution = new Solution();
        int[] result = solution.frequencySort(nums);

        // Print the result
        System.out.println(Arrays.toString(result)); // Output: [3, 1, 1, 2, 2, 2]
    }
}