import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            // 1️⃣ Count frequency of numbers in current subarray
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            }

            // 2️⃣ Convert map to list for sorting
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

            // 3️⃣ Sort by frequency desc, and if tie, by number desc
            Collections.sort(list, (a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue(); // higher freq first
                } else {
                    return b.getKey() - a.getKey(); // if tie, bigger number first
                }
            });

            // 4️⃣ Compute x-sum (sum of num * freq for top x entries)
            int sum = 0;
            int count = 0;
            for (Map.Entry<Integer, Integer> e : list) {
                if (count == x) break;
                sum += e.getKey() * e.getValue();
                count++;
            }

            // 5️⃣ Store result
            ans[i] = sum;
        }

        return ans;
    }
}