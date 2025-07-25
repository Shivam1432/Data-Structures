class Solution {
    public int[][] generateMatrix(int n) {
        int m=n;
        int k=0,l=0;
        int o=1;
        int[][] matrix=new int[m][n];
        while(k<m && l<n){
            for(int i=l;i<m;i++){
                matrix[k][i]=o++;
            }
            k++;
            for(int i=k;i<n;i++){
                matrix[i][n-1]=o++;
            }
            n--;
            if(k<m){
                for(int i=n-1;i>=l;--i){
                    matrix[m-1][i]=o++;
                }
                m--;
            }
            if(l<n){
                for(int i=m-1;i>=k;--i){
                    matrix[i][l]=o++;
                }
                l++;
            }
        }
        return matrix;
    }
}
