import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    
    
    public static int[] findTwoSum(int arr[], int target){

        HashMap<Integer,Integer> visited = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];  //sum(j) = target - sum(i)

            if(visited.containsKey(diff)){
                return new int[] {i, visited.get(diff)};
            }

            visited.put(arr[i], i);
        }

        return new int[] {0,0};
    }


    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int ans[] = findTwoSum(arr, 9);
        System.out.println("Indeices are" + Arrays.toString(ans));
    }
}
