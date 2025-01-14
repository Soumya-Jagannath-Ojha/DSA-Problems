
import java.util.*;

public class Topview {
    static class Node{
        int data;
        Node left, right;
        

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }


    public static void topView(Node root){
        // Using Map and horizental distance
        // hd - in level order traversal (QUEUE DS)

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0, max=0;


        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                // 1st time node is added to map
                if(!map.containsKey(curr.hd)){
                    // System.out.print(curr.hd+ " ");
                    // System.out.print("values are: ");
                    // System.out.print(curr.node.data+ " ");
                    map.put(curr.hd,curr.node);
                }
                // Traverse to left add to the map
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                // Traverse to right add to the map
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }

            }
        }
        
        for(int i=min; i<=max; i++){
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right  = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root);
    }
}
