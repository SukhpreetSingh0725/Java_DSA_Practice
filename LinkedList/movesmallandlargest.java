public class movesmallandlargest {

static Node shiftSmallLarge(Node head) {
    if(head==null) return null;
       int max=-1;
       int min=1001;
       
       
       Node curr=head;
       
       while(curr!=null){
           if(curr.data>max){
               max=curr.data;
           }
           if(curr.data<min){
               min=curr.data;
           }
           curr=curr.next;
          
       }
       if (min == max) return head;
       
       Node dummy=new Node(min);
       Node temp=dummy;
       while(head!=null){
           Node newnode=new Node(head.data);
           if(head.data!=max && head.data!=min){
               temp.next=newnode;
               temp=newnode;
           }
           head=head.next;
       }
       temp.next = new Node(max);
      
       return dummy;
   }
}
