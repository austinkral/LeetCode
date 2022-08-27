class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] result = new int[] {i, map.get(complement)};
                return result;
            } else {
                map.put(nums[i], i);
            }
        } //for
        return nums;
    } // twoSum
} // Solution