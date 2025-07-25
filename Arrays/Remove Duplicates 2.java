class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,i=0;
        int n=nums.length;
        if(n<3){
            return n;
        }
        for(i=0;i<n-2;i++){
            if(nums[i]!=nums[i+2]){
                nums[k]=nums[i];
                k++;
            }
        }
        nums[k++]=nums[n-2];
        nums[k++]=nums[n-1];
        return k;
    }
}
