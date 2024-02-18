class Solution {
    
    public int climbStairs(int n) {
        //****Recursive Solution*****
        
        // if (n == 0) {
        //     return 1;
        // }
        // if (n < 0) {
        //     return 0;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);

        // ****Memoization****

        // if (n == 0) {
        //     return 1;
        // }
        // if (n < 0) {
        //     return 0;
        // }
        // if (dp[n] != 0) {
        //     return dp[n];
        // }
        // return dp[n] = climbStairs(n-1) + climbStairs(n-2);

        //****Tabulation****

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}