class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String> seen = new HashSet<>();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') continue;
                if (seen.contains("R" + i + "," + board[i][j]) ||
                    seen.contains("C" + j + "," + board[i][j]) ||
                    seen.contains("R" + i/3 + "C" + j/3 + "," + board[i][j])) return false;
                seen.add("R" + i + "," + board[i][j]);
                seen.add("C" + j + "," + board[i][j]);
                seen.add("R" + i/3 + "C" + j/3 + "," + board[i][j]);
            } //for
        } //for
        
        return true;
    } //isValidSudoku
} //Solution
