

public class copyfirstToSecond {
    static Node copyList(Node head) {
        if(head==null) return null;
           Node dummy=new Node(0);
           Node curr=dummy;
           while(head!=null){
               Node newnode=new Node(head.data);
               curr.next=newnode;
               curr=newnode;
               head=head.next;
           }
           return dummy.next;
       }
}
