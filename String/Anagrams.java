import java.util.Arrays;

public class Anagrams {
    
    public static boolean areAnagrams(String s1, String s2) {

        // Step1 :- first lower the char
        boolean res = false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        // Step-2 check length is equal
        if(s1.length() == s2.length()){
            
            // step3 :- convert into char arr and check the two array
            char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            res = Arrays.equals(str1,str2);
        }
        return res;
        
    }


    public static void main(String[] args) {
        String a= "allergy";
        String b= "allergic";
        boolean res = areAnagrams(a, b);
        System.out.println(res);
    }
}
