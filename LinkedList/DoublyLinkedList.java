package LinkedList;
import java.util.Scanner;

class DNode {
    int data;
    DNode prev, next;

    DNode(int d) {
        data = d;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    static DNode head = null;
    static int size;

    static void insertAtBeginning(int x) {
        DNode newNode = new DNode(x);
        if (head != null)
            head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    static void insertAtEnd(int x) {
        DNode newNode = new DNode(x);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
        newNode.prev = curr;

        size++;
    }

    static void deleteFromBeginning() {
        if (head == null) return;
        head = head.next;
        if (head != null)
            head.prev = null;

        size--;
    }

    static void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        DNode curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.prev.next = null;
        size--;
    }

    static void printList() {
        DNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        insertAtBeginning(1);
        insertAtBeginning(2);
        insertAtBeginning(3);
        insertAtBeginning(4);
        insertAtEnd(5);
        deleteFromEnd();
        deleteFromBeginning();
        printList();

        sc.close();
    }
}
