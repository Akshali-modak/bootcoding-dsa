package sudoko;

public class SudokoEx{
        public boolean isSafe(char[][] board, int row, int col, int number) {
            //column
            for (int i = 0; i < board.length; i++) {
                if (board[i][col] == (char) (number + '0')) {
                    return false;
                }
            }

            //row
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] == (char) (number + '0')) {
                    return false;
                }
            }

            //grid
            int sr = 3 * (row / 3);
            int sc = 3 * (col / 3);

            for (int i = sr; i < sr + 3; i++) {
                for (int j = sc; j < sc + 3; j++) {
                    if (board[i][j] == (char) (number + '0')) {
                        return false;
                    }
                }
            }
            return false;
        }
}

