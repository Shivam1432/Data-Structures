class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
    int[] dp = new int[n];
    
    // Initialize with last row
    for (int i = 0; i < n; i++) {
        dp[i] = triangle.get(n - 1).get(i);
    }

    // Bottom-up from second last row
    for (int i = n - 2; i >= 0; i--) {
        List<Integer> row = triangle.get(i);
        for (int j = 0; j <= i; j++) {
            dp[j] = row.get(j) + Math.min(dp[j], dp[j + 1]);
        }
    }

    return dp[0];
    }
}
