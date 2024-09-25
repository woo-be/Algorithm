class Solution {
    public int solution(String A, String B) {
        int length = A.length();
        if (A.equals(B))
            return 0;
        for (int i = 0; i < length; i++) {
            A = shiftStr(A);
            if (A.equals(B)) {
                return i + 1;
            }
        }
        return -1;
    }
    
    public String shiftStr(String str) {
        return str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
    }
}