class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.valueOf(arr[i - 1]);
                continue;
            }
            answer += Integer.valueOf(arr[i]);
        }
        return answer;
    }
}