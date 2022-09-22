class Solution {
    public String reverseWords(String s) {
        String answer = new String();
        StringBuilder w = new StringBuilder();
        char[] charray = s.toCharArray();
        int start = 0;
        int idx = 0;
        for (char c : charray) {
            idx++;
            if (c == ' ') {
                w = new StringBuilder(s.substring(start, idx - 1));
                answer += w.reverse().toString() + " ";
                start = idx;
            } else if  (idx == charray.length) {
                w = new StringBuilder(s.substring(start, idx));
                answer += w.reverse().toString();
            } // if
        } // for
        return answer;
    } // reverseWords
} // Solution