class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] beforeArr = new int[27];
        int[] afterArr = new int[27];
        for (int i = 0; i < before.length(); i++) {
            beforeArr[before.charAt(i) - 'a']++;
        }
        for (int i = 0; i < after.length(); i++) {
            afterArr[after.charAt(i) - 'a']++;
        }
        for (int i = 0; i < beforeArr.length; i++) {
            if (beforeArr[i] != afterArr[i]) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}