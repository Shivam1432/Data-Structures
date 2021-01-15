import java.util.Scanner;

public class InorderPostorder {
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
	static class Index{
		int index;
	}
	static Node buildTree(int in[],int post[],int n)
    {
    	Index pIndex=new Index();
    	pIndex.index=n-1;
    	return buildUtil(in,post,0,n-1,pIndex);
    }
	static Node buildUtil(int[] in,int[] post,int st,int end,Index pIndex)
	{
		if(st>end)
			return null;
		Node node=new Node(post[pIndex.index]);
		(pIndex.index)--;
		if(st==end)
			return node;
		int iIndex=search(in,st,end,node.data);
		node.rightChild=buildUtil(in,post,iIndex+1,end,pIndex);
		node.leftChild=buildUtil(in,post,st,iIndex-1,pIndex);
		return node;
	}
	static int search(int arr[],int st,int end,int key)
	{
		int i;
		for(i=st;i<=end;i++)
		{
			if(arr[i]==key)
				break;
		}
		return i;
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
    static void preOrder(Node root)
    {
    	if(root==null)
    		return;
    	System.out.print(root.data+" ");
    	preOrder(root.leftChild);
    	preOrder(root.rightChild);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int in[]=new int[n];
        int post[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	in[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	post[i]=s.nextInt();
        }
        Node root=null;
        if(n!=0)
        	root=buildTree(in,post,n);
        preOrder(root);
        s.close();
	}

}
