class Solution {
    public int compress(char[] chars) {
        int write = 0; // Position to write compressed characters
        int read = 0;  // Position to read characters
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int start = read; // Start of the current group
            
            // Find the end of the group of the same characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
            }
            
            int count = read - start; // Length of the current group
            
            // Write the character
            chars[write++] = currentChar;
            
            // Write the count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
}