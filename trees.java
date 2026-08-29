import java.util.Scanner;
public class trees {
    public trees(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
        private Node root;
        public void populate(Scanner scn){
            System.out.println("Enter the root node value:");
            int value = scn.nextInt();
            root = new Node(value);
            populate(root, scn);

        }
        private void populate(Node root, Scanner scn){
            System.out.println("Do you want to enter the left node of " + root.value );
            boolean left = scn.nextBoolean();
            if(left){
                System.out.println("Enter the left node value of " + root.value);
                int value = scn.nextInt();
                root.left = new Node(value);
                populate(root.left, scn);
            }
            System.out.println("Do you want to enter the right node of " + root.value );
            boolean right = scn.nextBoolean();
            if(right){
                System.out.println("Enter the right node value of " + root.value);
                int value = scn.nextInt();
                root.right = new Node(value);
                populate(root.right, scn);
            }
            display(root, "");
        }
        private void display(Node node, String indent) {
    if (node == null) {
    return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
}

        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            trees tree = new trees();
            Node node = new Node(0);
            node.populate(scn);
        }
}
