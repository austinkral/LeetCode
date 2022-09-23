class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<Integer>();
        for (int n : nums) 
            if (!dup.add(n)) return true;
            else dup.add(n);
        return false;
    } // containsDuplicate
} // Solution