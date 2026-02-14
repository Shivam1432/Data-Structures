class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else{
                st.pop();
                if(!st.isEmpty()){  
                    int len = i - st.peek();
                    maxLen = Math.max(maxLen, len);
                }else{
                    st.push(i); // reset base
                }
            }
        }
        return maxLen;
    }
}
