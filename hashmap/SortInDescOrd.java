import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class SortInDescOrd {
    
    public static String sortInDesc(String str) {
        HashMap<Character,Integer> freq = new HashMap<>();
        
        // Add frequency
        for(int i=0; i<str.length(); i++){
            freq.put(str.charAt(i),freq.getOrDefault(str.charAt(i),0)+1);
        }

        // map -> List Item  for sorting
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(freq.entrySet());

        //Sort the List in desc
        entryList.sort((a,b) -> b.getValue() - a.getValue());

        // Add the character to the result
        StringBuilder result = new StringBuilder();
        for(Character key: freq.keySet()){
            char ch = key;
            int f = freq.get(key);

            for(int i=0; i<f; i++){
                result.append(ch);
            }

        }
        return result.toString();
    }




    public static void main(String[] args) {
        String str = "tree";
        System.out.println("String in desc order: "+sortInDesc(str));
    }
}
