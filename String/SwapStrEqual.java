public class SwapStrEqual {

    // Check if One String Swap Can Make Strings Equal
    
    /*You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
    Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false. */

    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int i = 0;
        int j = 0;
        int n = s1.length();

        for (int ch = 0; ch < n; ch++) {

            if (s1.charAt(ch) != s2.charAt(ch)) {
                count++;
                if(count > 2) return false;
                else{
                    if(count == 1){
                        i=ch;
                    }else{
                        j=ch;
                    }
                }
            }

        }

        return ((s1.charAt(i) == s2.charAt(j)) && (s2.charAt(i) == s1.charAt(j)));
    }
    
    
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(areAlmostEqual(s1,s2));
    }
}
