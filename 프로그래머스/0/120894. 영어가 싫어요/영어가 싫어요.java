class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String temp = "";
        String[] eng_num = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        while (!numbers.isEmpty()) {
            for (int i = 0; i < eng_num.length; i++) {
                if (numbers.startsWith(eng_num[i])) {
                    temp += i;
                    numbers = numbers.substring(eng_num[i].length());
                    break;
                }
            }
        }
        answer = Long.valueOf(temp);
        return answer;
    }
}