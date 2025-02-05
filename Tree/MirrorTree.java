package Tree;


public class MirrorTree {
    
    static class Node{
        int data;
        Node left, right;

        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void mirror(Node node) {
        
        if(node == null){
            return;
        }
        
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
        mirror(node.left);
        mirror(node.right);
    }



    public static void main(String[] args) {
        Node mt = new Node(1);
        mt.left = new Node(2);
        mt.right = new Node(3);
        mt.right.left = new Node(4);
        mirror(mt);
        


    }
}
