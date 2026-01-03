package LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class getlength {

    static int getLength(Node head) {
        if(head==null) return 0;
        Node curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            Node temp = new Node(x);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        int  ans = getLength(head);
        System.out.println(ans);
        sc.close();
    }
}

