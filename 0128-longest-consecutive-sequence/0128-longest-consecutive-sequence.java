class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        int sval = nums[0], maxLength = 1, tempLength = 1;
        
        for (int val : nums) map.put(val, true);
        
        for (int val : nums) if (map.containsKey(val-1)) map.put(val, false);
        
        for (int val : nums) {
            if (map.get(val)) {
                int temp = val;
                while (map.containsKey(++temp)) tempLength++;
                if (tempLength > maxLength) {
                    sval = val;
                    maxLength = tempLength;
                } // if
                tempLength = 1;
            } // if
        } // for
        return maxLength;
    } // longestConsecutive
} // Solution
