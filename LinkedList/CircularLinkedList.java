

import java.util.Scanner;

class CNode {
    int data;
    CNode next;

    CNode(int d) {
        data = d;
        next = null;
    }
}

public class CircularLinkedList {
    static CNode head = null;
    static int size;


    static void insertAtBeginning(int x) {
        CNode newNode = new CNode(x);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }
        CNode curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    static void insertAtEnd(int x) {
        CNode newNode = new CNode(x);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }
        CNode curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = newNode;
        newNode.next = head;
        size++;

    }

    static void deleteFromBeginning() {
        if (head == null || head.next == head) {
            head = null;
            return;
        }
        CNode curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = head.next;
        head = head.next;
        size--;
    }

    static void deleteFromEnd() {
        if (head == null || head.next == head) {
            head = null;
            return;
        }
        CNode curr = head;
        while (curr.next.next != head)
            curr = curr.next;
        curr.next = head;
        size--;
    }

    static void printList() {
        if (head == null) return;
        CNode curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
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

