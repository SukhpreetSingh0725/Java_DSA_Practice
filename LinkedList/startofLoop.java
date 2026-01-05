

public class startofLoop {
    class Result {
        static int loopInList(Node head) {
          // Write your code here
            if(head==null) return 0;
            Node slow=head;
            Node fast=head;
            int count=0;
            while(fast != null && fast.next != null){
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast){
                    slow=head;
                    while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                        count++;
                    }
                    return count;
                }
            }
            
            return 0;
          
        }
      }
}
