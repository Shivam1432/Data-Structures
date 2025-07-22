class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int k=0,l=0;
        while(k<m && l<n){
            for(int i=l;i<n;i++){
                list.add(matrix[k][i]);
            }
            k++;
            for(int i=k;i<m;i++){
                list.add(matrix[i][n-1]);
            }
            n--;
            if(k<m){
                for(int i=n-1;i>=l;--i){
                    list.add(matrix[m-1][i]);
                }
                m--;
            }
            if(l<n){
                for(int i=m-1;i>=k;--i){
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
