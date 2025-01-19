class Solution {
    public String stringShift(String s, int[][] shift) {
        for (int[] sh : shift) {
            if (sh[0] == 0) {
                // Left shift by sh[1]
                for (int i = 0; i < sh[1]; i++) {
                    s = s.substring(1) + s.charAt(0);
                }
            } else {
                // Right shift by sh[1]
                for (int i = 0; i < sh[1]; i++) {
                    s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
                }
            }
        }
        return s;
    }
}