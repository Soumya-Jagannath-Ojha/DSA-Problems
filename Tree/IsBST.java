public class IsBST {
    
    static class Node{
        int data;
        Node left, right;

        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static boolean validBST(Node root, Node min, Node max){
        if(root == null) return true;
        
        // check for right subtree
        if(min != null && root.data <= min.data){
            return false;
        }
        // check for left subtree
        else if(max != null && root.data >= max.data){
            return false;
        }
        
        return validBST(root.left,min,root) 
            && validBST(root.right,root,max);
    }


    public static void main(String[] args) {
        Node mt = new Node(1);
        mt.left = new Node(2);
        mt.right = new Node(3);
        mt.right.left = new Node(4);
        System.out.println(validBST(mt, null, null));

    }
}
