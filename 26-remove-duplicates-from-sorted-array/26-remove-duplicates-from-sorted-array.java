class Solution {
    public int removeDuplicates(int[] nums) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[r]);
            else nums[++r] = nums[i];
        } // for
        return r + 1;
    }
}