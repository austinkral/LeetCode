class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> freqCount = new ArrayList<List<Integer>>(nums.length + 1);
        System.out.println(freqCount.size());
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length + 1; i++) {
            freqCount.add(new ArrayList<Integer>());
        } // for
        int[] sol = new int[k];
        int solCount = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        } // for
        for (int key : freq.keySet()) {
            if (freqCount.get(freq.get(key)) == null) {
                freqCount.set(freq.get(key), new ArrayList<Integer>());
            } // if
            freqCount.get(freq.get(key)).add(key);
        } // for
        for (int i = freqCount.size() - 1; i >= 0 && solCount < k; i--) {
                for (int j : freqCount.get(i)) {
                 sol[solCount++] = j;
                } // for
        } // for
        return sol;
    } // topKFrequent
} // Solution