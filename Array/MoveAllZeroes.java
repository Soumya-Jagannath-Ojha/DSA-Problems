package Array;
public class MoveAllZeroes {

    public static void pushZerosToEnd(int[] arr) {
        // Two pointer approach
        //  i == 0 (ignore)
        //  i != 0 (swap)
        
        int i =0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,0,2,3};
        pushZerosToEnd(arr);
    }
}
