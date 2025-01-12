import java.util.HashSet;

public class Union {
    
    public static int findUnion(int a[], int b[]) {
        // Using HashSet
        HashSet<Integer> union = new HashSet<>();
        
        for(int i=0; i<a.length; i++){
            union.add(a[i]);
        }
        
        for(int i=0; i<b.length; i++){
            union.add(b[i]);
        }
        return union.size();
    }

    public static void main(String[] args) {
        int a[] = {1,2,4,5,6};
        int b[] = {5,6,7,8,9};
        System.out.println("Union of two set is: "+findUnion(a, b));
    }
}
