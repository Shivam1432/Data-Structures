/* The below class is given for use as Nodes
class Node {
  int data;
  Node next;
  Node(int d) {
    data=d;
  }
} */
class Result {
  static int loopInList(Node head) {
    Node slow_p = head, fast_p = head;  
  
    while (slow_p !=null && fast_p!=null && fast_p.next!=null)  
    {  
        slow_p = slow_p.next;  
        fast_p = fast_p.next.next;  
  
        /* If slow_p and fast_p meet at some point  
        then there is a loop */
        if (slow_p == fast_p)  
            return countNodes(slow_p);  
    }  
  
    /* Return 0 to indeciate that ther is no loop*/
    return 0;  
  }
  static int countNodes( Node n)  
{  
int res = 1;  
Node temp = n;  
while (temp.next != n)  
{  
    res++;  
    temp = temp.next;  
}  
return res;  
} 
}
