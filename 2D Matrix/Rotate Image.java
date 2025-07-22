class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] arr=new int[m*n];
        int k=0;
        for(int i=m-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                arr[k++]=matrix[i][j];
            }
        }
        k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[j][i]=arr[k++];
            }
        }
    }
}
