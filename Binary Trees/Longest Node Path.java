import java.util.Scanner;

public class LongestPath {
	static class Node{
		Node rightChild;
		Node leftChild;
		int data;
		public Node()
		{
			data=0;
		}
		public Node(int d)
		{
			data=d;
		}
	}
	static Node buildTree(int arr[],int n)
    {
    	Node root=null;
    	root=insertNode(arr,root,0,n);
    	return root;
    }
    static Node insertNode(int arr[],Node root,int i,int n)
    {
    	if(i<n)
    	{
    		Node temp=new Node(arr[i]);
    		root=temp;
    		root.leftChild=insertNode(arr,root.leftChild,2*i+1,n);
    		root.rightChild=insertNode(arr,root.rightChild,2*i+2,n);
    	}
    	return root;
    }
    static int len=0;
    static void printLongestPath(Node root)
    {
    	int path[]=new int[1000];
    	printPath(path,0,root);
    }
    static void printPath(int[] path,int pathLen,Node root)
    {
    	if(root==null)
    		return;
    	path[pathLen]=root.data;
    	pathLen++;
    	if(root.leftChild==null && root.rightChild==null)
    	{
    		printArray(path,pathLen);
    	}
    	else
    	{
    		printPath(path,pathLen,root.leftChild);
        	printPath(path,pathLen,root.rightChild);
    	}
    }
    static void printArray(int path[],int pathLen)
    {
    	if(len<pathLen)
    	{
    		len=pathLen;
    		System.out.println("Longest Path:");
    		for(int i=0;i<pathLen;i++)
        	{
        		System.out.print(path[i]+" ");
        	}
    		System.out.println("\nNumber of edges: ");
        	System.out.print(len-1);
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        Node root=null;
        root=buildTree(arr,n);
        printLongestPath(root);
        s.close();
	}

}
