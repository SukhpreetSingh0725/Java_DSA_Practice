

public class reverseinkgroups {
    public Node reverseKGroup(Node head, int k) {
        Node curr=head;
        Node prev=null;
        Node Next=null;
        int count=0;
        if(curr==null || curr.next==null || k<=1){
            return head;
        }
        while (curr!=null && count<k) {
            curr = curr.next;
            count++;
        }
        if (count<k) return head;
        curr = head;
        count=0;

        while(curr!=null && count<k){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
            count++;
        }
        head.next=reverseKGroup(curr,k);
        return prev;

    }
}
