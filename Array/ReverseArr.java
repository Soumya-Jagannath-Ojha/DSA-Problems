package Array;
public class ReverseArr {
    public static void reverseArray(int arr[]) {
        // Two pointer approach and swap method
        int fast = 0;
        int last = arr.length - 1;
        
        while(fast < last){
            int temp = arr[fast];
            arr[fast] = arr[last];
            arr[last] = temp;
            fast++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,1,2,8,3};
        reverseArray(arr);
    }
}
