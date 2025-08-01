class Solution {
    public boolean canJump(int[] nums) {
        int i=0,m=nums.length-1;
        for(int j=0;j<=m;j++){
            int jump=nums[j];
            if(j>i){
                return false;
            }
            i=Math.max(i,j+jump);
        }
        return true;
    }
}
