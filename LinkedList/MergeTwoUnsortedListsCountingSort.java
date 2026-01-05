public class MergeTwoUnsortedListsCountingSort {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node mergeUnsortedLists(Node head1, Node head2) {

        int[] freq = new int[1001];

        Node temp = head1;
        while (temp != null) {
            freq[temp.data]++;
            temp = temp.next;
        }

        temp = head2;
        while (temp != null) {
            freq[temp.data]++;
            temp = temp.next;
        }

        Node dummy = new Node(0);
        Node curr = dummy;

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                curr.next = new Node(i);
                curr = curr.next;
                freq[i]--;
            }
        }

        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = new Node(7);
        head1.next.next.next = new Node(1);

        Node head2 = new Node(3);
        head2.next = new Node(2);
        head2.next.next = new Node(6);

        Node result = mergeUnsortedLists(head1, head2);

        print(result);
    }
}
