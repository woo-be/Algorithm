class Solution {
    public double solution(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return (double) sum / length;
    }
}