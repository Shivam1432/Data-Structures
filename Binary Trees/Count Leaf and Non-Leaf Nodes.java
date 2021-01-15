import java.util.Scanner;

public class CountLeafNonLeaf {
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
    static int countLeafs(Node root)
    {
    	if(root==null)
    		return 0;
    	if(root.leftChild==null && root.rightChild==null)
    		return 1;
    	else 
    		return countLeafs(root.leftChild)+countLeafs(root.rightChild);
    }
    static int countNonLeafs(Node root)
    {
    	if(root==null || root.leftChild==null && root.rightChild==null)
    		return 0;
    	return 1+countNonLeafs(root.leftChild)+countNonLeafs(root.rightChild);
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
        System.out.println();
        int leaf=countLeafs(root);
        System.out.println("Number of leaf nodes: "+leaf);
        int nonleaf=countNonLeafs(root);
        System.out.println("Number of internal nodes: "+nonleaf);
        s.close();
	}
}
