public class oddEvenposition {
    static Node rearrangeList(Node head) {

          
          if(head==null) return null;
          Node curr=head;
          Node evenhead=null,eventail=null;
          Node oddhead=null,oddtail=null;
          int pos=1;
          
          while(curr!=null){
              Node newnode=curr.next;
              curr.prev=null;
              curr.next=null;
              
              if(pos%2==0){
                  if(evenhead==null){
                      evenhead=eventail=curr;
                  }
                  else{
                      eventail.next=curr;
                      curr.prev=eventail;
                      eventail=curr;
                  }
              }
              
              else{
                  if(oddhead==null){
                      oddhead=oddtail=curr;
                  }
                   else{
                      oddtail.next=curr;
                      curr.prev=oddtail;
                      oddtail=curr;
                  }
              }
              curr=newnode;
              pos++;
          }
          
          if(evenhead==null) return oddhead;
          if(oddhead==null) return evenhead;
          
          eventail.next=oddhead;
          oddhead.prev=eventail;
          
          return evenhead;
    
      }
}
