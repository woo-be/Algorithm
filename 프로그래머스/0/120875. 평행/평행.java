class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[][] line1 = new int[2][2];
        int[][] line2 = new int[2][2];
        
        line1[0] = dots[0];
        line1[1] = dots[1];
        line2[0] = dots[2];
        line2[1] = dots[3];
        if (pyeonghaeng(line1, line2))
            answer = 1;
        
        line1[0] = dots[0];
        line1[1] = dots[2];
        line2[0] = dots[1];
        line2[1] = dots[3];
        if (pyeonghaeng(line1, line2))
            answer = 1;
        
        line1[0] = dots[0];
        line1[1] = dots[3];
        line2[0] = dots[1];
        line2[1] = dots[2];
        if (pyeonghaeng(line1, line2))
            answer = 1;
        
        return answer;
    }
    
    public boolean pyeonghaeng(int[][] line1, int[][] line2) {
        double giulgi1 = (double) (line1[0][0] - line1[1][0]) / (line1[0][1] - line1[1][1]);
        double giulgi2 = (double) (line2[0][0] - line2[1][0]) / (line2[0][1] - line2[1][1]);
        if (giulgi1 == giulgi2) {
            return true;
        }
        return false;
    }
}