class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        int[] count = new int[total + 1];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                count[grid[r][c]]++;
            }
        }
        int repeated = 0;
        int missing = 0;
        for (int i = 1; i <= total; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}