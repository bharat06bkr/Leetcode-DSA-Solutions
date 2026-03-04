// class Solution {
//     public int[][] onesMinusZeros(int[][] grid) 
//     {
//         int m=grid.length;
//         int n=grid[0].length;
//         int arr[][]=new int[m][n];
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//                 arr[i][j]=add(i,j,grid);
//         }  
//         return arr;  
//     }
//     public static int add(int row,int col,int [][]arr)
//     {
//         int m=arr.length;
//         int n=arr[0].length;
//         int row_0=0;
//         int row_1=0;
//         for(int i=0;i<n;i++)
//         {
//             if(arr[row][i]==0)
//                 row_0++;
//             else 
//                 row_1++;
//         }
//         int col_0=0;
//         int col_1=0;
//         for(int i=0;i<m;i++)
//         {
//             if(arr[i][col]==0)
//                 col_0++;
//             else 
//                 col_1++;
//         }
//         return (row_1+col_1)-(row_0+col_0);
//     }
// }  

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = 2 * (onesRow[i] + onesCol[j]) - (m + n);
            }
        }

        return ans;
    }
}
