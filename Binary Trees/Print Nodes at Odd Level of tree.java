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
  static void printOdd(Node root) {
    if(root==null)
  {
    return ;
  }
   Node temp=root;
   int height=1,i;
    while(temp.leftChild !=null)
    { 
       height++;
       temp=temp.leftChild;    
    }
  for(i=0;i<height;i=i+2)
  {
    printLevelWise(root,i); 
  }
  }
   static void printLevelWise(Node temp,int level) 
 {  
   if(temp==null)
   {return ;}
   if(level==0)
   {
     System.out.print(temp.data+" ");
      return ;
   }
   printLevelWise(temp.leftChild,level-1);
   printLevelWise(temp.rightChild,level-1); 
 } 
}
