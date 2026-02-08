class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (int[] a,int[] b)->a[0]-b[0]);
        int[] current=intervals[0];
        List<int[]> result=new ArrayList<>();
        result.add(current);
        for(int[] interval:intervals){
            int currEnd=current[1];
            int intStart=interval[0];
            int intEnd=interval[1];
            if(currEnd>=intStart){
                current[1]=Math.max(currEnd,intEnd);
            }
            else{
                current=interval;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
