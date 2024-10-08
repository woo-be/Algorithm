class Solution {
    
    public int solution(String[] babbling) {
        int answer = 0;
        for (String babble : babbling) {
            if (m1(babble))
                answer++;
        }
        return answer;
    }
    
    public boolean m1(String babble) {
        final String aya = "aya";
        final String ye = "ye";
        final String woo = "woo";
        final String ma = "ma";
        String temp = babble.replace(aya, " ").replace(ye, " ").replace(woo, " ").replace(ma, " ");
        if (temp.isBlank()) {
            return true;
        }
        return false;
    }
}