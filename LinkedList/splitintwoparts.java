public class splitintwoparts {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head1 = null;
    static Node head2 = null;

    static void splitCircularList(Node head) {
        if (head == null) return;

        Node slow = head;
        Node fast = head;


        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next.next == head) {
            fast = fast.next;
        }


        head1 = head;
        head2 = slow.next;


        fast.next = slow.next;

        slow.next = head;
    }

    // ===== Print Circular Linked List =====
    static void printList(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // ===== Main =====
    public static void main(String[] args) {

        // Create Circular Linked List: 1 → 2 → 3 → 4 → 5 → back to 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // circular

        System.out.println("Original Circular List:");
        printList(head);

        splitCircularList(head);

        System.out.println("First Half:");
        printList(head1);

        System.out.println("Second Half:");
        printList(head2);
    }
}
