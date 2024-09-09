class Solution {
    public String solution(int age) {
        String answer = "";
        char[] arr = String.valueOf(age).toCharArray();
        for (char c : arr) {
            char temp = (char) ('a' + (c - '0'));
            answer += temp;
        }
        return answer;
    }
}