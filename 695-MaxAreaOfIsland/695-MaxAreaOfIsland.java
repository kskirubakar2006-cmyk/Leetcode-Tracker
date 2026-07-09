// Last updated: 09/07/2026, 15:07:19
import java.util.*;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    maxArea = Math.max(maxArea, bfs(grid, vis, i, j));
                }
            }
        }

        return maxArea;
    }

    private int bfs(int[][] grid, boolean[][] vis, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
        vis[row][col] = true;

        int area = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            area++;

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    grid[nr][nc] == 1 &&
                    !vis[nr][nc]) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return area;
    }
}