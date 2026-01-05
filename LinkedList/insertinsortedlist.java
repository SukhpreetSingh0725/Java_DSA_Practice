

public class insertinsortedlist {
    static LinkList insertSorted(LinkList head, int data) {
        LinkList newNode = new LinkList(data);
        if (head == null) {
          newNode.next = newNode;
          return newNode;
        }
        LinkList curr = head;
        if (data <= head.data) {
          while (curr.next != head) {
            curr = curr.next;
          }
          curr.next = newNode;
          newNode.next = head;
          head = newNode;
          return head;
        }
        while (curr.next != head && curr.next.data < data) {
          curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
      }
}
