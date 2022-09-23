class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (freq.containsKey(c)) freq.put(c, freq.get(c) + 1);
            else freq.put(c, 1);
        } // for
        for (char c : t.toCharArray()) {
            if (freq.getOrDefault(c, 0) == 0) return false;
            else freq.put(c, freq.get(c) - 1);
        } // for
        return true;
    } // isAnagram
} // Solution