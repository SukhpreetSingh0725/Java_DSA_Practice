public class SwapKthFromStartAndEnd {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node swapKth(Node head, int k) {
        if (head == null) return head;

        Node first = head;
        Node second = head;


        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        Node kthFromStart = first;


        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

 
        int temp = kthFromStart.data;
        kthFromStart.data = second.data;
        second.data = temp;

        return head;
    }


    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // ===== Main =====
    public static void main(String[] args) {

        // Linked List: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        System.out.print("Original: ");
        printList(head);

        head = swapKth(head, k);

        System.out.print("After swapping kth from start & end: ");
        printList(head);
    }
}
