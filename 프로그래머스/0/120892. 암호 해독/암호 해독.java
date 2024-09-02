class Solution {
    public String solution(String cipher, int code) {
        int index = 1;
        int cipherLength = cipher.length();
        int plainLength = cipherLength / code;
        char[] arr = cipher.toCharArray();
        char[] plain = new char[plainLength];
        for (int i = 0, j = 0; i < cipherLength; i++) {
            if (index % code == 0) {
                plain[j] = arr[i];
                j++;
            }
            index++;
        }
        String answer = String.valueOf(plain);
        return answer;
    }
}