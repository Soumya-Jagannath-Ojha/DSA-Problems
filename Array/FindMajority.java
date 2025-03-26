package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Problem Statement
// You are given an array of integer arr[] where each number represents a vote to a candidate. 
// Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote,
//  return an empty array. 

// Note: The answer should be returned in an increasing format.
// Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
// Output: [5, 6]
// Explanation: 5 and 6 occur more n/3 times.


public class FindMajority {

    public static List<Integer> findMajority(int[] nums) {
        // Using HashMap
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        // least value
        int min = (int)(n/3) + 1;
        
        for(int i=0; i<n; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i], value + 1);
            
            if(map.get(nums[i]) == min){
                al.add(nums[i]);
            }
            if(al.size() == 2) break;
        }
        Collections.sort(al);   
        return al;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        findMajority(arr);

        ArrayList<Integer> path = new ArrayList<>();
        path.add(1);
        path.add(2);
        path.add(3);
        path.add(4);
        System.out.println(path);
        path.remove(3);
        System.out.println(path);
        System.out.println(path.get(2));

    }
}
