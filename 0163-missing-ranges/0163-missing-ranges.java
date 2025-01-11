class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> answer = new ArrayList<>();
        int prev = lower - 1, n = nums.length;

        for (int i = 0; i <= n; ++i) {
            int curr = (i < n) ? nums[i] : upper + 1;
            if (prev + 1 <= curr - 1) {
                answer.add(Arrays.asList(prev + 1, curr - 1));
            }
            prev = curr;
        }

        return answer;
    }
}