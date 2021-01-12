import java.util.Scanner;
class Node
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
public class DeleteNode {
	
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
	static Node minValueNode(Node node)
	{
	  Node current = node;
	  while (current.leftChild != null)
	    current = current.leftChild;
	  return current;
	}

	static Node deleteNode(Node root, int key)
	{
	  if (root == null)
	  {
	    System.out.println("Node not found"); 
	    return null;
	  }

	  if (key < root.data)
	    root.leftChild = deleteNode(root.leftChild, key);

	  else if (key > root.data)
	    root.rightChild = deleteNode(root.rightChild, key);

	  else
	  {
	    Node temp = null;
	    if (root.leftChild == null && root.rightChild == null)
	    {
	      return null;
	    }
	    else if(root.leftChild == null)
	    {
	      temp = root.rightChild;
	      return temp;
	    }
	    else if (root.rightChild == null)
	    {
	      temp = root.leftChild;
	      return temp;
	    }
	    temp = minValueNode(root.rightChild);
	    root.data = temp.data;
	    root.rightChild = deleteNode(root.rightChild, temp.data);
	  }
	  return root;
	}
	static void printInorder(Node root)
	{
	  if (root == null)
	    return;
	  printInorder(root.leftChild);
	  System.out.print(root.data + " ");
	  printInorder(root.rightChild);
	}

	public static void main(String ar[])
	{
	  Scanner s=new Scanner(System.in);
	  Node root = null;
	  root = insert(root, 3);
	  root = insert(root, 5);
	  root = insert(root, 4);
	  root = insert(root, 1);
	  root = insert(root, 6);
	  root = insert(root, 2);
	  root = insert(root, 0);
	  root = insert(root, 9);
	  System.out.println("\nInorder traversal of binary tree is ");
	  printInorder(root);
	  System.out.println("\nEnter number to insert:");
	  int i=s.nextInt();
	  root = insert(root, i);
	  int key = 6;
	  System.out.println("\nDelete node with key = "+key);
	  root = deleteNode(root, key);
	  System.out.println("\nInorder traversal of binary search tree is ");
	  printInorder(root);
	  s.close();
	}
}
