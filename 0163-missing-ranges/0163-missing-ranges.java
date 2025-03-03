class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ar = new ArrayList<>();
        
        for (int i = 0; i <= nums.length; i++) {
            int next = (i < nums.length) ? nums[i] : upper + 1;
            
            if (lower < next) {
                ar.add(Arrays.asList(lower, next - 1));
            }
            
            lower = next+1;
        }

        return ar;
    }
}