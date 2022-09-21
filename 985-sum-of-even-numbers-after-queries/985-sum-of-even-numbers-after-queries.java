class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        List<Integer> answer = new ArrayList<Integer>();
        int osum = 0;
        for (int n : nums) if (n % 2 == 0) osum += n;
        int sum = osum;
        for(int[] q : queries) {
            int original = nums[q[1]];
            nums[q[1]] += q[0];
            if (nums[q[1]] % 2 == 0 && original % 2 == 0) sum += q[0];
            if (nums[q[1]] % 2 == 0 && original % 2 != 0) sum += nums[q[1]];
            if (nums[q[1]] % 2 != 0 && original % 2 == 0) sum -= original;
            answer.add(sum);
        } // for
        return answer.stream().mapToInt(Integer::intValue).toArray();
    } // sumEvenAfterQueries
} // Solution