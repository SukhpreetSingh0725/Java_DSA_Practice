package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    

    Node(int d) {
        data = d;
        next = null;
        
    }
}

public class SinglyLLBasic {
     static Node head = null;
     static int size;

    static void insertAtBeginning(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }

    static void insertAtEnd(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
        size++;
    }

    static void deleteFromBeginning() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    static void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        size--;
    }

    static void printList() {
        Node curr = head;
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


