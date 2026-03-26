// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize data and next pointer
    Node(int data1) {
        data = data1;
        next = null;
    }
}

// Solution class containing the method to find length
class Solution {
    // Function to find the length of the linked list
    public int lengthOfLinkedList(Node head) {
        // Initialize counter to 0
        int count = 0;

        // Initialize a temporary pointer to head
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Increment count for each node
            count++;

            // Move to the next node
            temp = temp.next;
        }

        // Return the total count
        return count;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating a sample linked list
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        second.next= third;
        head.next = second;

        // Create Solution object
        Solution obj = new Solution();

        // Find and print the length of linked list
        System.out.println("Length of Linked List: "
                        + obj.lengthOfLinkedList(head));
    }
}
