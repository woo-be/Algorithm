class Solution {
    public String[] solution(String my_str, int n) {
        int answer_length = my_str.length() / n + ((my_str.length() % n) >= 1 ? 1 : 0);
        String[] answer = new String[answer_length];
        for (int i = 0, j = 0; i < answer_length; i++, j += n) {
            if ((j + n) > my_str.length()) {
                answer[i] = my_str.substring(j, my_str.length());
            } else {
                answer[i] = my_str.substring(j, j + n);
            }
        }
        return answer;
    }
}