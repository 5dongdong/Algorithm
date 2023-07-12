class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] bomb = new int[board.length][board[0].length];
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 1) {
                        check(i, j, bomb);
                }
            }
            }
        int cnt = 0;
        for (int[] array : bomb) {
            for (int value : array) {
                if (value == 0) cnt++;
            }
        }
        return cnt;
    }
    public static void check(int x, int y, int[][] bomb) {
        int bombX;
        int bombY;
        int[] aroundX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] aroundY = {0, -1, 0, 1, -1, 1, -1, 0, 1};
        for(int i = 0; i < 9; i++) {
            bombX = x + aroundX[i];
            bombY = y + aroundY[i];
        //구석
        if (bombX < bomb.length && bombY < bomb.length){
                if (bombX >= 0 && bombY >= 0) {
                    bomb[bombX][bombY] = 1;
                }
        } 
    }
}
}