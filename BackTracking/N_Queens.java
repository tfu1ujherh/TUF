package BackTracking;
import java.util.*;

class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Use HashSets to track occupied rows and diagonals
        Set<Integer> rows = new HashSet<>();
        Set<Integer> posDiagonal = new HashSet<>(); // row + col
        Set<Integer> negDiagonal = new HashSet<>(); // row - col

        // Start backtracking from column 0
        solve(n, 0, res, board, rows, posDiagonal, negDiagonal);

        // Print the result
        System.out.println(res);
    }

    public static void solve(int n, int col, List<List<String>> res, char[][] board,
                            Set<Integer> rows, Set<Integer> posDiagonal, Set<Integer> negDiagonal) {
        // Base case: If all columns are processed, add the current configuration to the result
        if (col == n) {
            res.add(boardConstruct(board));
            return;
        }

        // Try placing a queen in each row of the current column
        for (int row = 0; row < n; row++) {
            // Check if the current cell is safe
            if (rows.contains(row) || posDiagonal.contains(row + col) || negDiagonal.contains(row - col)) {
                continue; // Skip if not safe
            }

            // Place the queen
            board[row][col] = 'Q';
            rows.add(row);
            posDiagonal.add(row + col);
            negDiagonal.add(row - col);

            // Move to the next column
            solve(n, col + 1, res, board, rows, posDiagonal, negDiagonal);

            // Backtrack (remove the queen)
            board[row][col] = '.';
            rows.remove(row);
            posDiagonal.remove(row + col);
            negDiagonal.remove(row - col);
        }
    }

    // Convert the 2D char array into a list of strings
    public static List<String> boardConstruct(char[][] board) {
        List<String> solution = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            solution.add(new String(board[i]));
        }
        return solution;
    }
}