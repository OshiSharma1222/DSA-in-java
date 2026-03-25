class Node{
    private int data;
    private Node next;//pointer to the next node
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;

    }
    public Node getNext(){//Node use to point to the next node
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
public class linkedlist{
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(null);
        head = insertatfront(head, 5);
        printlinkedlist(head);
    }
    public static void printlinkedlist(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
        }
        public static Node insertatfront(Node head, int data){
            Node nn = new Node(data);
            nn.setNext(null);
            if(head==null){
                head = nn;
            }
            else{
                nn.setNext(head);
                head = nn;
            }
            return head;
        }
    }
