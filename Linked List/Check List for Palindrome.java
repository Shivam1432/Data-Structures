/* class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
} */
class Result {
  static int checkPalindrome(Node head) {
int count=0,num=0;
     Node last=head;
    
    while(last!=null)
    {
      count++;
      last=last.next;
    }
    
    last=head;
   
    for(int i=0;i<count;i++)
    {
      num=num*10+last.data;
      last=last.next;
    }

    
   int rev=0,a;
  int  num1=num;
   while(num!=0) 
   {
     a=num%10;
    rev=rev*10+a; 
     num=num/10;
     
     
   }
    if(rev==num1&& rev!=0)
      return 1;
    else
      return 0;
  }
}
