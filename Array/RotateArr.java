package Array;
public class RotateArr {
    // Function to rotate an array by d elements in counter-clockwise direction.
    public static void rotateArr(int arr[], int d) {
        // using module method
        int n = arr.length;
        d = d % n;

        // temporary array to store the rotated version
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n]; // Shift elements left
        }

        // Copy temp back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,1,2};
        rotateArr(arr,3);

    }
}
