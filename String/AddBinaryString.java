public class AddBinaryString {
    public static String addBinary(String s1, String s2) {
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);

        // Step 1 - Make both strings equal in length by padding with leading zeros
        while (str1.length() < str2.length()) {
            str1.insert(0, '0');
        }
        while (str1.length() > str2.length()) {
            str2.insert(0, '0');
        }

        // Step 2 - Carry variable and result
        char c = '0'; // carry
        StringBuilder ans = new StringBuilder();

        // Step 3 - Iterate from the end of the strings
        for (int i = str1.length() - 1; i >= 0; i--) {
            int sum = (str1.charAt(i) - '0') + (str2.charAt(i) - '0') + (c - '0');

            if (sum == 3) {
                ans.append('1');
                c = '1';
            } else if (sum == 2) {
                ans.append('0');
                c = '1';
            } else if (sum == 1) {
                ans.append('1');
                c = '0';
            } else {
                ans.append('0');
                c = '0';
            }
        }

        // Step 4 - Append the final carry if it exists
        if (c == '1') {
            ans.append('1');
        }

        // Step 5 - Remove leading zeros
        while (ans.length() > 0 && ans.charAt(ans.length() - 1) == '0') {
            ans.deleteCharAt(ans.length() - 1);
        }

        // If result is empty, append '0'
        if (ans.length() == 0) {
            ans.append('0');
        }

        // Step 6 - Reverse the result and return as a string
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        String a= "1001";
        String b= "01";
        String ans = addBinary(a,b);
        System.out.println(ans);
    }
}
