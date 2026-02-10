class Solution {
    public String reverseWords(String s) {
        String[] tokens=s.trim().split("\\s+");
        StringBuilder str=new StringBuilder();
        for(int i=tokens.length-1;i>=1;i--){
            str.append(tokens[i]);
            str.append(" ");
        }
        return str.append(tokens[0]).toString();
    }
}
