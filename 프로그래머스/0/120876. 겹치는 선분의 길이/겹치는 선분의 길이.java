class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[201];
        int offset = 100;
        for (int i = 0; i < 3; i++) {
            int start = lines[i][0];
            int end = lines[i][1];
            if ((start == lines[(i + 1) % 3][1] && end == lines[(i + 2) % 3][0] && (end - start) == 1) || 
                (start == lines[(i + 2) % 3][1] && end == lines[(i + 1) % 3][0] && (end - start) == 1)) {
                answer--;
            }
            for (int j = 0; j < end - start + 1; j++) {
                line[start + offset + j]++;
            }
        }
        for (int i = 0; i < line.length - 1; i++) {
            if (line[i] >= 2 && line[i+1] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}