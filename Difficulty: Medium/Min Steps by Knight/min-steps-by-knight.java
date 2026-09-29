class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // code here
        if (knightPos[0] == targetPos[0] &&
            knightPos[1] == targetPos[1]) {
            return 0;
        }

        int[][] moves = {
            {2, 1},
            {2, -1},
            {-2, 1},
            {-2, -1},
            {1, 2},
            {1, -2},
            {-1, 2},
            {-1, -2}
        };

        boolean[][] visited = new boolean[n + 1][n + 1];
        Queue<int[]> queue = new LinkedList<>();

        int startX = knightPos[0];
        int startY = knightPos[1];

        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];
            int steps = current[2];

            for (int[] move : moves) {
                int newX = x + move[0];
                int newY = y + move[1];

                if (newX >= 1 && newX <= n &&
                    newY >= 1 && newY <= n &&
                    !visited[newX][newY]) {

                    if (newX == targetPos[0] &&
                        newY == targetPos[1]) {
                        return steps + 1;
                    }

                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY, steps + 1});
                }
            }
        }

        return -1;
    }
}