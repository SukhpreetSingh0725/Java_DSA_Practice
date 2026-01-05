

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SearchElement {

    static boolean search(Node head, int x) {
      if(head==null) return false;
      Node curr=head;
      while(curr!=null){
        if(curr.data==x){
            return true;
        }
        curr=curr.next;
      }
        return false;
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
        int x=sc.nextInt();

        boolean  ans = search(head,x);
        System.out.println(ans);
        sc.close();
    }
}

