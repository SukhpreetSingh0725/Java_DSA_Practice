package LinkedListTricks;

public class ReverseAlternateKGroups {

    // ===== Node Definition =====
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===== Reverse Alternate k Groups using Array =====
    static Node reverseAlternateK(Node head, int k) {

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

        // Step 3: Reverse alternate k groups
        boolean reverse = true;
        for (int start = 0; start < n; start += k) {
            if (reverse && start + k <= n) {
                int l = start;
                int r = start + k - 1;
                while (l < r) {
                    int t = arr[l];
                    arr[l] = arr[r];
                    arr[r] = t;
                    l++;
                    r--;
                }
            }
            reverse = !reverse;
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

        // Linked List: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int k = 2;

        System.out.print("Original: ");
        printList(head);

        head = reverseAlternateK(head, k);

        System.out.print("After alternate k reverse: ");
        printList(head);
    }
}

