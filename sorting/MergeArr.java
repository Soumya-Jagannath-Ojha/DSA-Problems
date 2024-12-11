package sorting;

import java.util.Arrays;

public class MergeArr {
    

    // Function to merge the arrays. (With out using extra space)
    public static void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int left = n-1;
        int right = 0;
        
        // Using two pointer approach
        
        while(left >= 0 && right <m){
            if(a[left] > b[right]){
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7};
        int b[] = {0,2,6,8,9};
        mergeArrays(a,b);
    }
}
