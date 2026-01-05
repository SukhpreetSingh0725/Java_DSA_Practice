public class rightrotatebyk {
  
static LinkList rotateByK(LinkList head, int k)
{
    if (head == null || k == 0) return head;
    int len=1;
    LinkList curr=head;
    while(curr.next!=null){
        len++;
        curr=curr.next;
    }
    k=k%len;
    if(k==0) return head;
    LinkList tail=curr;
    tail.next=head;
    head.prev=tail;
  
    
    k=len-k;
    curr=head;
    
    while(k-- >0){
        curr=curr.next;
    }
    LinkList newHead = curr;
    newHead.prev.next = null;
    newHead.prev = null;
    return newHead;

}
}
