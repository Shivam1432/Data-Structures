//Solution 1
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
//Solution 2
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0; 
    }
}
