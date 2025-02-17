public class Rat_in_maze {
    public static void print(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solvemaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("solution is not available");
            return false;
        }
        print(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1) {
            sol[x][y] = 1; // Mark the destination in the solution
            return true;
        }

        if (isSafe(maze, x, y)) {
            // Check if the current cell is already part of the current path
            if (sol[x][y] == 1) {
                return false; // Already visited in this path, prevent cycles
            }

            sol[x][y] = 1; // Mark the current cell as part of the solution

            // Try moving down
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            // Try moving right
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }
            //Try moving up
            if (solveMazeUtil(maze, x - 1, y, sol)) {
                return true;
            }
            //Try moving left
            if (solveMazeUtil(maze, x, y - 1, sol)) {
                return true;
            }

            sol[x][y] = 0; // Backtrack: If no path is found from this cell, unmark it
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        solvemaze(maze);
    }
}
