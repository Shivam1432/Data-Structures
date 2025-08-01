class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        dp[0][0] = true; // Empty strings match

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                int k = i + j - 1;
                if (i > 0 && s1.charAt(i - 1) == s3.charAt(k))
                    dp[i][j] |= dp[i - 1][j];
                if (j > 0 && s2.charAt(j - 1) == s3.charAt(k))
                    dp[i][j] |= dp[i][j - 1];
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
