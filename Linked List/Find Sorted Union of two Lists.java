/* class Node
{
  int data;
  Node next;
} */
static Node findUnion(Node head1, Node head2) 
{
  Node p1=head1;
  Node p2=head2;
  int c1=0,c2=0;
  while(p1!=null)
  {
    p1=p1.next;
    c1++;
  }
  p1=head1;
  while(p2!=null)
  {
    c2++;
    p2=p2.next;
  }
  p2=head2;
  int arr1[]=new int[c1];
  int arr2[]=new int[c2];
  int i = 0, j = 0;
  while(p1!=null && i<c1)
  {
    arr1[i++]=p1.data;
    p1=p1.next;
  }
  while(p2!=null && j<c2)
  {
    arr2[j++]=p2.data;
    p2=p2.next;
  }
     i=0;j=0;
  int m=c1,n=c2;
  for(i=0;i<m;i++)
  {
    for(j=i+1;j<m;j++)
    {
      if(arr1[i]>arr1[j])
      {
        int t=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=t;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(arr2[i]>arr2[j])
      {
        int t=arr2[i];
        arr2[i]=arr2[j];
        arr2[j]=t;
      }
    }
  }
  i=0;j=0;
    while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
    }
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
  return null;
}
