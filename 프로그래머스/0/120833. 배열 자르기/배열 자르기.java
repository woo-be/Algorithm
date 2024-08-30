class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1 + 1;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = numbers[num1];
            num1++;
        }
        return arr;
    }
}