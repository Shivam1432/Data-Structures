/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static LinkList listCut(LinkList head) {
    if(head==null)
    return null;
    
    LinkList head1=null;
    LinkList laste=head;
    int count=0,half,i;
    LinkList last1=head;
    LinkList last2=head;
    while(laste.next!=head)
    {
      count++;
      laste=laste.next;
    }
    count++;
    half=count/2;
    for(i=0;i<half;i++){
      last1=last1.next;
    }
    
    for(i=0;i<half-1;i++)
    {
      last2=last2.next;
    }
    
    last2.next=head;
    head1=last1;
    laste.next=last1;
    
    return head1;
    
  }
}
