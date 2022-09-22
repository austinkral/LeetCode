class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder w = new StringBuilder();
        char[] charray = s.toCharArray();
        int start = 0;
        int idx = 0;
        for (char c : charray) {
            idx++;
            if (c == ' ') {
                w = new StringBuilder(s.substring(start, idx - 1));
                sb.append(w.reverse() + " ");
                start = idx;
            } else if  (idx == charray.length) {
                w = new StringBuilder(s.substring(start, idx));
                sb.append(w.reverse());
            } // if
        } // for
        return sb.toString();
    } // reverseWords
} // Solution