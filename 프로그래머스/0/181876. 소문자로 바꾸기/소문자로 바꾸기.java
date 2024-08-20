class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] < 'a') { // 대문자일때,
                int temp = arr[i] - 'A';
                arr[i] = (char) ('a' + temp);
            }
        }
        String answer = String.valueOf(arr);
        System.out.println(answer);
        return answer;
    }
}