import java.util.Scanner;

public class SearchNode {
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
	static Node search(Node root,int key)
	{
		if(root==null||root.data==key)
			return root;
		else if(root.data>key)
			return search(root.leftChild,key);
		
		return search(root.rightChild,key);
	}
	static void searchNode(Node root,int key)
	{
		root=search(root,key);
		if(root==null)
			System.out.println("Not found");
		else
			System.out.println("Node found: "+root.data);
			
	}
	static void printInorder(Node root)
	{
	  if (root == null)
	    return;
	  printInorder(root.leftChild);
	  System.out.print(root.data + " ");
	  printInorder(root.rightChild);
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
        printInorder(root);
        System.out.println("\nEnter value to search: ");
        int key=s.nextInt();
        searchNode(root,key);
        s.close();
	}

}
