/*
class BSTNode{
    int data;
    int hd; //horizontal distance
    BSTNode left;
    BSTNode right;
    BSTNode(int data,int hd){
        this.data = data;
        this.hd = hd;
    }
}
The above class is available for use.*/

class Result {
    static ArrayList<Integer> bottomView(BSTNode root){
      if(root==null)
      {
        return null;
      }
      Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
      Queue<BSTNode> q=new LinkedList<BSTNode>();
      q.add(root);
      while(!q.isEmpty())
      {
        BSTNode temp=q.poll();
        map.put(temp.hd,temp.data);
        if(temp.left!=null)
        {
          q.add(temp.left);
        }
        if(temp.right!=null)
        {
          q.add(temp.right);
        }
      }
      ArrayList<Integer> l=new ArrayList<Integer>();
      for(Map.Entry<Integer,Integer> entry:map.entrySet())
      {
        int val=entry.getValue();
        l.add(val);
      }
      return l;
    } 
}
