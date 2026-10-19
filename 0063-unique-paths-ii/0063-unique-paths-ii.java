class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];

        for ( int i = 0; i < dp.length; i++){
            for ( int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        return paths( 0, 0, m, n,obstacleGrid, dp);

        
    }

    public int paths( int i , int j, int m, int n, int obstacleGrid[][], int dp[][]){
      
        if ( i >= m || j >= n){
            return 0;
        }

        if (obstacleGrid[i][j] == 1){
            return 0;
        }
        if ( i == m -1 && j == n - 1){
            return 1;
        }

        if ( dp[i][j] != -1){
            return dp[i][j];
        }

        int w1 = paths( i + 1, j, m, n, obstacleGrid, dp);
        int w2 = paths( i, j + 1, m, n, obstacleGrid, dp);
        return dp[i][j] = w1 + w2;
    }
}