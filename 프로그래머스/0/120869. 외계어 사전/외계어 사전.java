class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String str1 : dic) {
            int temp = 1;
            for (String str2 : spell) {
                if (!str1.contains(str2)) {
                    temp = 2;
                    break;
                }
            }
            if (temp == 1) {
                answer = temp;
                break;
            }
        }
        return answer;
    }
}