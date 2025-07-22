class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        int index = 1;
        solve(answer,combi,n,k,index);
        return answer;
    }
void solve(List<List<Integer>> answer, List<Integer> combi, int n, int k, int index) {

        if(combi.size() == k) {
            answer.add(new ArrayList<>(combi));
            return;
        }

        for(int i=index;i<=n;i++) {
            combi.add(i);
            solve(answer,combi,n,k,i+1);
            combi.remove(combi.size()-1);
        }
    }
}
