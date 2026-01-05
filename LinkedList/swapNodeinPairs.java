

public class swapNodeinPairs {
    static Node swapPairs(Node head) {
        if (head == null || head.next == null) return head;
    
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
    
        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;
    
            // swap
            first.next = second.next;
            second.next = first;
            prev.next = second;
    
            prev = first;
        }
    
        return dummy.next;
    }
    
}
