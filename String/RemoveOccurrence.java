public class RemoveOccurrence {
    

    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();

        for(char ch : s.toCharArray()){
            sb.append(ch);
            if(sb.length() >= m){
                // Extract the SubString from sb
                String sub = sb.substring(sb.length() - m);
                if(sub.equals(part)){
                    // Remove from the String Builder
                    sb.setLength(sb.length() - m);
                }
            }

        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(str, part));
    }
}
