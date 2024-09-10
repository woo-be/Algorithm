class Solution {
    public String solution(String my_string) {
        int[] uppercase = new int[27];
        int[] lowercase = new int[27];
        int space = 0;
        int length = my_string.length();
        for (int i = 0; i < length; i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                
                if (lowercase[c - 'a'] == 0) {
                    lowercase[c - 'a']++;
                } else {
                    my_string = my_string.substring(0, i) + my_string.substring(i + 1);
                    length--;
                    i--;
                }
                
            } else if (c >= 'A' && c <= 'Z') {
                
                if (uppercase[c - 'A'] == 0) {
                    uppercase[c - 'A']++;
                } else {
                    my_string = my_string.substring(0, i) + my_string.substring(i + 1);
                    length--;
                    i--;
                }
                
            } else if (c == ' ') {
                
                if (space == 0) {
                    space++;
                } else {
                    my_string = my_string.substring(0, i) + my_string.substring(i + 1);
                    length--;
                    i--;
                }
            }
            
        }
        return my_string;
    }
}