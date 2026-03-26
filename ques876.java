//ques876 middle of the linked list
 // Definition for singly-linked list.
 class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    }
    
class Solution {
    public ListNode middleNode(ListNode head) {
        int count =0 ;
        ListNode temp= head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        int mid = count/2+1 ;
        temp = head;
        // if()
        while (temp!= null)
        {
            mid = mid -1;
            if(mid ==0)
                break;

            temp = temp.next;

        } while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        return temp;
    }
}
public class ques876{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution obj = new Solution();
        ListNode middle = obj.middleNode(head);
        System.out.println("Middle Node Value: " + middle.val);
}
}