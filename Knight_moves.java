public class Knight_moves {
    public boolean isvalid(int grid[][], int r, int c, int n, int expval) {
        if (r < 0 || c < 0 || c >= n || r >= n || grid[r][c] != expval) {
            return false;
        }
        if (expval == n * n - 1) {
            return true;
        }
        grid[r][c] = expval + 1; // Mark the current cell as visited
        boolean ans1 = isvalid(grid, r - 2, c + 1, n, expval + 1);
        boolean ans2 = isvalid(grid, r - 1, c + 2, n, expval + 1);
        boolean ans3 = isvalid(grid, r + 1, c + 2, n, expval + 1);
        boolean ans4 = isvalid(grid, r + 2, c + 1, n, expval + 1);
        boolean ans5 = isvalid(grid, r + 2, c - 1, n, expval + 1);
        boolean ans6 = isvalid(grid, r + 1, c - 2, n, expval + 1);
        boolean ans7 = isvalid(grid, r - 1, c - 2, n, expval + 1);
        boolean ans8 = isvalid(grid, r - 2, c - 1, n, expval + 1);
        grid[r][c] = expval; // Unmark the current cell
        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }

    public boolean checkValidGrid(int[][] grid) {
        return isvalid(grid, 0, 0, grid.length, 0);
    }
}
