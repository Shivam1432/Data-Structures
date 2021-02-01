/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
static int count=0,p=0;
static int kSmallest(Node t1, int k)
{
 if(t1==null)
  return 0;
   int height=1,i=0,j=0;
    Node temp=t1;
    while(temp!=null)
    {
      height++;
      temp=temp.leftChild;  
    }
    for(i=1;i<=height;i++)
    {
      countNodes(t1,i);
    }
    for(i=1;i<=height;i++)
    {
        insertArray(t1,i);
    }
  int x;
  for(i=0;i<7;i++)
  {
    for(j=i+1;j<6;j++)
    {
      if(arr[i]>arr[j])
      {
        x=arr[j];
        arr[j]=arr[i];
        arr[i]=x;
      }
    }
  } 
    return arr[k-1];  
}
static void countNodes(Node root,int level)
{ 
  if(root==null)
  {
    return ;
  }
  if(level==1)
  {
  count++;
  }
  countNodes(root.leftChild,level-1);
  countNodes(root.rightChild,level-1);
}
static int k=count;
static int arr[]=new int[7];
static void insertArray(Node root,int level)
{ 
  if(root==null)
  {
    return ;
  }
  if(level==1)
  {
  arr[p]=root.data;
  p++;  
  } 
  insertArray(root.leftChild,level-1);
  insertArray(root.rightChild,level-1); 
}
