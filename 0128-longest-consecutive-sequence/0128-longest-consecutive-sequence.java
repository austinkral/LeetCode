class Solution {
    public int longestConsecutive(int[] nums) {
        int out = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int n : nums) {
                set.add(n);
        } //for
        
        for(int i = 0; i < nums.length; i++){
            int maxlen = 1;
            int previous = nums[i]-1;
            int next = nums[i]+1; 
            while(set.contains(previous)){ 
                set.remove(previous--); 
                maxlen++;
            } //while
            while(set.contains(next)){ 
                set.remove(next++);
                maxlen++;
            } //while
            out = Math.max(out,maxlen); 
        } //for
        return out;
    } //longestConsecutive
} //Solution
