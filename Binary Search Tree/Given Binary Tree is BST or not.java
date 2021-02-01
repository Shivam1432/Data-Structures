/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
class Result {
  static int isBinarySearchTree(Node t1) {
    if(isBSTUtil(t1,Integer.MIN_VALUE,Integer.MAX_VALUE))
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
  static boolean isBSTUtil(Node node,int min,int max)
  {
     if (node == null) 
            return true; 
  
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max) 
            return false; 
  
        /* otherwise check the subtrees recursively 
        tightening the min/max constraints */
        // Allow only distinct values 
        return (isBSTUtil(node.leftChild, min, node.data-1) && 
                isBSTUtil(node.rightChild, node.data+1, max)); 
  }
}
