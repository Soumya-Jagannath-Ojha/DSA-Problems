package Heap;

import java.util.ArrayList;

public class HeapDS {

    // create Heap class
    static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        // Operations

        // 1. Add
        public void add(int data) {
            // Add at last idx
            al.add(data);

            // Find the idx of par & child
            int child = al.size() - 1;
            int par = (child - 1) / 2;

            // Correct the heap
            while (al.get(par) > al.get(child)) {
                // Swap
                int temp = al.get(child);
                al.set(child, al.get(par));
                al.set(par, temp);
                child = par;
                par = (child - 1) / 2;
            }

        }

        // 2. Peek operation
        public int peek() {
            return al.get(0);
        }


        // Delete
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < al.size()  &&  al.get(minIdx) > al.get(left)){
                minIdx = left;
            }
            if(right < al.size() &&  al.get(minIdx) > al.get(right)){
                minIdx = right;
            }

            // check minIdx
            if(minIdx != i){
                // swap
                int temp = al.get(i);
                al.set(i, al.get(minIdx));
                al.set(minIdx, temp);
                heapify(minIdx);
            }
        }
        public int remove() {
            // 3 step process
            int data = al.get(0);
            // step 1: swap root with last idx
            int temp = al.get(0);
            al.set(0,al.size() - 1);
            al.set(al.size()-1,temp);

            // remove from last
            al.remove(al.size()-1);

            // heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return al.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(4);
        hp.add(10);
        hp.add(25);
        System.out.println("element at 1st idx " + hp.peek());
        

        System.out.println();
        while(!hp.isEmpty()){
            System.out.println(hp.peek());
            hp.remove();
        }


    }
}
