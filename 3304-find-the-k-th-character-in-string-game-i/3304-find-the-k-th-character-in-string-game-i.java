class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        // grow until length ≥ k
        while (sb.length() < k) {
            int len = sb.length();
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb1.append((char)(sb.charAt(i) + 1));
            }
            sb.append(sb1);
        }

        // return 1-based k as zero-based index
        return sb.charAt(k - 1);
    }
}