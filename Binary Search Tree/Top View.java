/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
import java.util.*;
import java.util.Map.Entry;
class Result {
  static void printTopView(Node root) {
    class QueueObj{
      int hd;
      Node node;
      QueueObj(Node node,int hd)
      {
        this.node=node;
        this.hd=hd;
      }
    }
    Queue<QueueObj> q=new LinkedList<QueueObj>();
    Map<Integer,Node> map=new TreeMap<Integer,Node>();
    if(root==null)
      return;
    else
    {
      q.add(new QueueObj(root,0));
    }
    while(!q.isEmpty())
    {
      QueueObj temp=q.poll();
      if(!map.containsKey(temp.hd))
      {
        map.put(temp.hd,temp.node);
      }
      if(temp.node.leftChild!=null)
      {
        q.add(new QueueObj(temp.node.leftChild,temp.hd-1));
      }
      if(temp.node.rightChild!=null)
      {
        q.add(new QueueObj(temp.node.rightChild,temp.hd+1));
      }
    }
    for(Entry<Integer,Node> entry:map.entrySet())
    {
      System.out.print(entry.getValue().data+" ");
    }
  }
}
