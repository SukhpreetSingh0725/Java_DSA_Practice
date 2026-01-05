

public class mergetwosortedlist {
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy=new Node(0);
        Node curr=dummy;
        Node c1=list1;
        Node c2=list2;
        while(c1 !=null && c2 !=null){
            if(c1.val <c2.val){
                curr.next=c1;
                c1=c1.next;
            }
            else{
                curr.next=c2;
                c2=c2.next;
            }
            curr=curr.next;
        }
        if(c1!=null){
            curr.next=c1;
        }
        else{
            curr.next=c2;
        }
    return dummy.next;    
    }
}
