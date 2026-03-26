

class ListNode{
    int val;
    ListNode next;
    ListNode (){}//default constructor
    ListNode (int val){ this.val = val;}//constructor with value
    ListNode (int val, ListNode next){ this.val = val; this.next = next;}//constructor with value and next node
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
            while (temp != null) {
            // Save the next node
            ListNode front = temp.next;

            // Reverse the current node's pointer
            temp.next = prev;

            // Move prev to current node
            prev = temp;

            // Move to the next node
            temp = front;
        }

        // Return new head (last node becomes first)
        return prev;
        // ListNode temp = head;
        // Stack<Integer> st = new Stack<>();
        // while(temp!= null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while (temp!= null)
        // {
        //     temp.val = st.pop();
        //     temp = temp.next;
        // }
        // return head;
    }
}
public class ques206{
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution obj = new Solution();
        ListNode reversedHead = obj.reverseList(head);

        // Print the reversed linked list
        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}