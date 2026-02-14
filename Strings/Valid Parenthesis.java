class Solution {
    public boolean isValid(String s) {
        Deque<Character> q=new ArrayDeque<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                q.push(ch);
                continue;
            }
            else{
                if(q.isEmpty()){
                    return false;
                }
                else{
                char c=q.pop();
                switch(ch){
                    case ')':
                    if(c=='{' || c=='['){
                        return false;
                    }
                    break;
                    case '}':
                    if(c=='(' || c=='['){
                        return false;
                    }
                    break;
                    case ']':
                    if(c=='(' || c=='{'){
                        return false;
                    }
                    break;
                } 
            }
            }
        }
        if(q.isEmpty()){
            return true;
        }
        return false;
    }
}
