package LinkedListTricks;

public class SwapPairs {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static Node swapPairs(Node head) {

        // Step 1: Count nodes
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Step 2: LL → Array
        int[] arr = new int[n];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }

        // Step 3: Swap adjacent elements
        for (i = 0; i + 1 < n; i += 2) {
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
        }

        // Step 4: Array → LL
        temp = head;
        i = 0;
        while (temp != null) {
            temp.data = arr[i++];
            temp = temp.next;
        }

        return head;
    }

    // ===== Print List =====
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

        System.out.print("Original: ");
        printList(head);

        head = swapPairs(head);

        System.out.print("After swapping pairs: ");
        printList(head);
    }
}
