class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 0) {
            return 0;
        }
        // Move n-1 disks from 'from' to 'aux' using 'to' as auxiliary
        int moves = towerOfHanoi(n - 1, from, aux, to);
        // Move the nth disk from 'from' to 'to'
        moves += 1;
        // Move n-1 disks from 'aux' to 'to' using 'from' as auxiliary
        moves += towerOfHanoi(n - 1, aux, to, from);
        return moves;
    }
}