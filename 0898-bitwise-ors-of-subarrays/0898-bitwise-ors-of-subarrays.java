import java.util.*;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();  // Stores unique OR values
        Set<Integer> cur = new HashSet<>();  // OR values of subarrays ending at this index
        
        for (int num : arr) {  
            Set<Integer> newCur = new HashSet<>();
            newCur.add(num);  // Start a new subarray
            
            for (int prev : cur) {  
                newCur.add(prev | num);  // Extend subarrays
            }
            
            cur = newCur;  // Update cur for next iteration
            res.addAll(cur);  // Store unique OR values
        }
        
        return res.size();  // Return the count of unique OR values
    }
}