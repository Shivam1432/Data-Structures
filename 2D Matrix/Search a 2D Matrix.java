class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target && matrix[i][n-1]>=target){
                if(binary(matrix[i],target)!=-1){
                    return true;
                }
            }
        }
        return false;
    }
    public int binary(int[] arr,int t){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==t){
                return mid;
            }
            if(arr[mid]<t){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
