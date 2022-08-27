class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWordCount = 0, wordCount = 1;
        for (String s : sentences) {
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == ' ') wordCount++;
            } // for
            if (wordCount > maxWordCount) maxWordCount = wordCount;
            wordCount = 1;
        } // for
        return maxWordCount;
    }
}