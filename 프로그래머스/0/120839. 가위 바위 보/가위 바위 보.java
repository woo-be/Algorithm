class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += cal(arr[i]);
        }
        return answer;
    }
    
    public String cal (char c) {
        switch (c) {
            case '2':
                return "0";
            case '0':
                return "5";
            case '5':
                return "2";
            default:
                return "e";
        }
    }
}