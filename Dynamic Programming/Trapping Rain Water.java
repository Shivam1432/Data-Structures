class Solution {
    public int trap(int[] height) {
        int max=0;
        int leftMax=0;
        int rightMax=0;
        int a=0;
        int b=height.length-1;
        while(a<=b){
            leftMax=Math.max(height[a],leftMax);
            rightMax=Math.max(height[b],rightMax);
            if(leftMax<rightMax){
                max+=leftMax-height[a];
                a++;
            }
            else{
                max+=rightMax-height[b];
                b--;
            }
        }
        return max;
    }
}
