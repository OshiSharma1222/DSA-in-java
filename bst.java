public class bst {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
        public int getvalue(){
            return value;
        }

    }
    private Node root;
    public bst(){
        
    }

    public int height(Node node){
        if((node == null))
            return -1;
        return node.height;
        }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        this.insert(root, value);
    }
    private Node insert(Node node, int value)
    {
        if(node == null){
            node = new Node(value);
            return node;
    }
    if(value <node.value){
        node.left = insert(node.left, value);
    
    }
    if (value >node.value){
        node.right = insert(node.right, value);
    }
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return node;
    }
    public void populate(int [] arr){
        for(int i = 0; i< arr.length; i++){
            this.insert(arr[i]);
        }
    
    }
        public void populatedSorted(int []arr){
            populatedSorted(arr, 0, arr.length-1);
        }
    private void populatedSorted(int []arr, int start, int end) {
        if(start> end)
            return;
        int mid = (start +end)/2;
        this.insert(arr[mid]);
        populatedSorted(arr, start, mid-1);
        populatedSorted(arr, mid+1, end);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null)
            return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(root, "");
    }
    private void display(Node node, String details){
        if(node == null)
            return;
        System.out.println(details + " " + node.value);
        display(node.left, details + " L");
        display(node.right, details + " R");
    }

}
