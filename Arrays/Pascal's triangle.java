class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0){
            return result;
        }
        List<Integer> list=new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=result.get(i-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(1);

            for(int j=1;j<i;j++){
                int s=prev.get(j-1)+prev.get(j);
                curr.add(s);
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}
