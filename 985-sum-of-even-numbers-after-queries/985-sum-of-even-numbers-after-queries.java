/*
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[queries.length];
        int esum = 0, i = 0;
        for (int n : nums) if (n % 2 == 0) esum += n;
        for(int[] q : queries) {
            esum = nums[q[1]] % 2 == 0 ? esum -= nums[q[1]] : esum;
            nums[q[1]] += q[0];
            esum = nums[q[1]] % 2 == 0 ? esum += nums[q[1]] : esum;
            answer[i++] = esum;
        } // for
        return answer;
    } // sumEvenAfterQueries
} // Solution
*/


class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[queries.length];
        int esum = 0, i = 0;
        for (int n : nums) if (n % 2 == 0) esum += n;
        for (int[] q : queries) {
            int original = nums[q[1]];
            nums[q[1]] += q[0];
            if (original % 2 == 0 && q[0] % 2 == 0) esum += q[0];
            if (original % 2 == 0 && q[0] % 2 != 0) esum -= original;
            if (original % 2 != 0 && q[0] % 2 != 0) esum += nums[q[1]];
            answer[i++] = esum;
        } // for
        return answer;
    } // sumEvenAfterQueries
} // Solution
