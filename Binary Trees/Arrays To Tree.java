import java.util.Scanner;
class Node{
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
public class ArrayToTree {
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
    static void inOrder(Node root)
    {
    	if(root==null)
    		return;
    	inOrder(root.leftChild);
    	System.out.print(root.data+" ");
    	inOrder(root.rightChild);
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
        inOrder(root);
        s.close();
	}

}
