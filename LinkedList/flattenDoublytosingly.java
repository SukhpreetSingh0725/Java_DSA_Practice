public class flattenDoublytosingly {

    static class DNode {
        int data;
        DNode prev;
        DNode next;

        DNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static DNode flattenToSingly(DNode head) {

        DNode curr = head;
        while (curr != null) {
            curr.prev = null;  
            curr = curr.next;
        }

        return head;
    }


    static void print(DNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // ===== Main =====
    public static void main(String[] args) {

        // Create Doubly Linked List: 1 ⇄ 2 ⇄ 3 ⇄ 4
        DNode head = new DNode(1);
        DNode n2 = new DNode(2);
        DNode n3 = new DNode(3);
        DNode n4 = new DNode(4);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;

        head = flattenToSingly(head);

        System.out.print("Flattened Singly List: ");
        print(head);
    }
}
