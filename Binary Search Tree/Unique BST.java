class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            int treeCount = 0;
            for (int j = 1; j <= i; j++) {
                treeCount += dp[j - 1] * dp[i - j];
            }
            dp[i] = treeCount;
        }
        
        return dp[n];
    }
}
