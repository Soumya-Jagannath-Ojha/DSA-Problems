package Tree;

import java.util.ArrayList;

public class KthSum {
    
    static int count = 0;

    static class Node{
        int data;
        Node left, right;

        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static void sumKUtil(Node root,int k, ArrayList<Integer> path){
        // Base case
        if(root == null){
            return;
        }
        // Add curr node val
        path.add(root.data);
        // System.out.println(path.add(root.data));
        // System.out.println(path);
        
        // call for left
        sumKUtil(root.left,k,path);
        
        // Call for right
        sumKUtil(root.right,k,path);
        
        // check sumK
        int size = path.size();
        int sum = 0;
        for(int i=size-1; i>=0; i--){
            sum += path.get(i);
            // System.out.println("sum at "+i+ " "+sum);
            if(sum == k){
                count++;
                System.out.println("count is: "+count);
            }
            
        }
        // path.remove(path.size() - 1);
        // System.out.println("remove: "+path.remove(path.size() -1));
        path.remove(path.size() -1);
    }


    public static int sumK(Node root, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        // int count = 0;
        sumKUtil(root,k,path);
        return count;
    }


    public static void main(String[] args) {
        
        Node mt = new Node(1);
        mt.left = new Node(2);
        mt.right = new Node(3);
        mt.right.left = new Node(4);
        
        System.out.println(sumK(mt, 3));
        


    }
}
