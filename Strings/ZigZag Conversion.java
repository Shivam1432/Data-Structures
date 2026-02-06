class Solution {
    public String convert(String s, int numRows) {
        int i=0,j=0;
        int n=s.length()-1;
        if(n<=1 || numRows<=1){
            return s;
        }
        Map<Integer,StringBuilder> map=new HashMap<>();
        while(i<=n){
            while(1==1){
                if(j>=numRows || i>n){
                    break;
                }
                j++;
                if(map.get(j)!=null){
                    StringBuilder val=map.get(j);
                    val.append(s.charAt(i));
                    map.put(j,val);
                    i++;
                } 
                else{
                    StringBuilder val=new StringBuilder();
                    val.append(s.charAt(i));
                    map.put(j,val);
                    i++;
                } 
            }
            if(j==numRows){
                while(1==1){
                    if(j==1 || i>n){
                        break;
                    }
                    --j;
                   if(map.get(j)!=null){
                    StringBuilder val=map.get(j);
                    val.append(s.charAt(i));
                    map.put(j,val);
                    i++;
                } 
                else{
                    StringBuilder val=new StringBuilder();
                    val.append(s.charAt(i));
                    map.put(j,val);
                    i++;
                }
                }
            }
            
        }
        StringBuilder str=new StringBuilder();
        for(int k=1;k<=numRows;k++){
            StringBuilder st=map.get(k);
            if(st!=null){
                str.append(st);
            }
        }
        return str.toString();
    }
}
