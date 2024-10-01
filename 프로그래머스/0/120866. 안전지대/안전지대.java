class Solution {
  public static int solution(int[][] board) {
    int answer = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 1) {
          danger(board, i, j);
        }
      }
    }
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 0) {
          answer++;
        }
      }
    }
    return answer;
  }

  public static void danger(int[][] board, int i, int j) {
    if (i == 0 && j == 0) {
      if (board.length == 1)
        return;
      check(board, i, i + 1, j, j + 1);
    } else if (i == 0 && j == board.length - 1) {
      check(board, i, i + 1, j - 1 , j);
    } else if (i == board.length - 1 && j == 0) {
      check(board, i - 1, i, j, j+ 1);
    } else if (i == board.length - 1 && j == board.length - 1) {
      check(board, i - 1, i, j - 1, j);
    } else if (i == 0) {
      check(board, i, i + 1, j - 1, j + 1);
    } else if (i == board.length - 1) {
      check(board, i - 1, i, j - 1, j + 1);
    } else if (j == 0) {
      check(board, i - 1, i + 1, j, j + 1);
    } else if (j == board.length - 1) {
      check(board, i - 1, i + 1, j - 1, j);
    } else {
      check(board, i - 1, i + 1, j - 1, j + 1);
    }
  }

  public static void check(int[][] board, int startA, int endA, int startB, int endB) {
    for (int i = startA; i <= endA; i++) {
      for (int j = startB; j <= endB; j++) {
        minus1(board, i, j);
      }
    }
  }

  public static void minus1(int[][] board, int a, int b) throws ArrayIndexOutOfBoundsException {
    if (board[a][b] == 1)
      return;
    board[a][b] = -1;
  }
}