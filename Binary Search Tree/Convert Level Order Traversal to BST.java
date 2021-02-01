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
  static Node buildSearchTree(int arr[], int n) {
    // Complete the function body.
    if(n == 0)return null; 
    Node root = null; 
    for(int i = 0; i < n; i++) 
    root = LevelOrder(root , arr[i]); 
    return root; 
  }
  static Node LevelOrder(Node root , int data)  
{ 
    if(root == null) 
    {  
        root = getNode(data); 
        return root; 
    } 
    if(data <= root.data) 
    root.leftChild = LevelOrder(root.leftChild, data); 
    else
    root.rightChild = LevelOrder(root.rightChild, data); 
    return root;      
}
  static Node getNode(int data) 
{ 
    Node newNode = new Node(); 
     
    newNode.data = data; 
    newNode.leftChild = newNode.rightChild = null;  
    return newNode; 
}
}
