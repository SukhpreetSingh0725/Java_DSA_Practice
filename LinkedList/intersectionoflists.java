import java.util.HashSet;
import java.util.LinkedHashSet;

public class intersectionoflists {
    static Node intersection(Node head1, Node head2) {
    HashSet<Integer> set = new HashSet<>();

    Node curr = head1;
    while (curr != null) {
        set.add(curr.data);
        curr = curr.next;
    }

    LinkedHashSet<Integer> result = new LinkedHashSet<>();

    curr = head2;
    while (curr != null) {
        if (set.contains(curr.data)) {
            result.add(curr.data);
        }
        curr = curr.next;
    }

    Node dummy = new Node(0);
    curr = dummy;

    for (int val : result) {
        curr.next = new Node(val);
        curr = curr.next;
    }

    return dummy.next;
}

}
