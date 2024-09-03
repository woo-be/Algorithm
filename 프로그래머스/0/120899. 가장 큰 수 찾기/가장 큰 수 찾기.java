class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        int[] answer = {max, index};
        return answer;
    }
}