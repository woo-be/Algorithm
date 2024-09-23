import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        Square square = new Square(dots);
        int answer = square.area();
        return answer;
    }
}

class Square {
    
    int x1, x2, x3, x4;
    int y1, y2, y3, y4;
    int width;
    int height; 
    
    public Square(int[][] dots) {
        x1 = dots[0][0];
        y1 = dots[0][1];
        x2 = dots[1][0];
        y2 = dots[1][1];
        x3 = dots[2][0];
        y3 = dots[2][1];
        x4 = dots[3][0];
        y4 = dots[3][1];
    }
    
    public int area() {
        width = Math.abs(x1 - x2) >= Math.abs(x1- x3) ? Math.abs(x1 - x2) : Math.abs(x1- x3);
        height = Math.abs(y1 - y2) >= Math.abs(y1- y3) ? Math.abs(y1 - y2) : Math.abs(y1- y3);
        return width * height;
    }
}