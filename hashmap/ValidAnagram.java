import java.util.*;
public class ValidAnagram {
    
    public static boolean validAnagram(String a, String b){

        if(a.length() != b.length()){
            return false;
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(int j=0; j<b.length(); j++){
            char ch = b.charAt(j);
            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch, hm.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(validAnagram(s, t));
    }
}
