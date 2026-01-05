import java.util.LinkedHashSet;

public class unionoflists {
    static Node union(Node head1, Node head2) {
    LinkedHashSet<Integer> set = new LinkedHashSet<>();

    Node curr = head1;
    while (curr != null) {
        set.add(curr.data);
        curr = curr.next;
    }

    curr = head2;
    while (curr != null) {
        set.add(curr.data);
        curr = curr.next;
    }

    Node dummy = new Node(0);
    curr = dummy;

    for (int val : set) {
        curr.next = new Node(val);
        curr = curr.next;
    }

    return dummy.next;
}

}
