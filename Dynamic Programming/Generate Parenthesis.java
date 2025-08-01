class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> patterns=new ArrayList<>();
        generate(patterns,"",0,0,n);
        return patterns;
    }
    public void generate(List<String> l,String s,int o,int c,int n){
        if(s.length()==n*2){
            l.add(s);
            return ;
        }
        if(o<n){
            generate(l,s+'(',o+1,c,n);
        }
        if(c<o){
            generate(l,s+')',o,c+1,n);
        }
    }
}
