class Solution {
    public int solution(int[] common) {
        int length = common.length;
        if (common[1] * common[1] == common[0] * common[2]) { // 참이면 등비수열, 거짓이면 등차수열
            if (common[0] == 0) // 첫 항이 0인 등비수열.
                return 0;
            return common[length - 1] * common[length - 1] / common[length - 2];
        } else {
            return common[length - 1] * 2 - common[length - 2];
        }
    }
}