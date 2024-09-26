class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] frequency = new int[1000];
        for (int i = 0; i < array.length; i++) {
            frequency[array[i]]++;
        }
        boolean sevaral = false;
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] == frequency[answer]) {
                sevaral = true;
                continue;
            }
            if (frequency[i] > frequency[answer]) {
                answer = i;
                sevaral = false;
            }
        }
        if (sevaral) {
            return -1;
        }
        return answer;
    }
}