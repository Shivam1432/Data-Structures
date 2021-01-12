import java.util.Scanner;

public class LevelOrderTraversal {
	static class Node
	{
	  int data; 
	  Node leftChild;
	  Node rightChild;
	  public Node()
	  {
	    data=0;
	  }
	  public Node(int d)
	  {
	    data=d;
	  }
	}
	static Node insert(Node root, int key)
	{
	  if (root == null){
	    Node temp = new Node();
	    temp.data = key;
	    temp.leftChild = temp.rightChild = null;
	    return temp;
	  }
	  if (key < root.data)
	    root.leftChild = insert(root.leftChild, key);
	  else if (key > root.data)
	    root.rightChild = insert(root.rightChild, key);
	  return root;
	}
	static void LevelOrder(Node root)
	{
		int height=height(root);
		for(int i=1;i<=height;i++)
			printLevelOrder(root,i);
	}
	static int height(Node root)
	{
		if(root==null)
			return 0;
		int left=height(root.leftChild);
		int right=height(root.rightChild);
		if(left>right)
			return (left+1);
		else
			return (right+1);
	}
	static void printLevelOrder(Node root,int level)
	{
		if(root==null)
			return;
		if(level==1)
		{
			System.out.print(root.data+" ");
			return;
		}
		else
		{
			printLevelOrder(root.leftChild,level-1);
			printLevelOrder(root.rightChild,level-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Node root=null;
		int n;
		n=s.nextInt();
		int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        	root=insert(root,arr[i]);
        }
        LevelOrder(root);
        s.close();
	}

}
