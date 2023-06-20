class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (value <= n * n) { //최대값까지
            // 오른쪽으로 이동
            for (int i = minCol; i <= maxCol; i++) {
                answer[minRow][i] = value++;
            }
            minRow++;

            // 아래로 이동
            for (int i = minRow; i <= maxRow; i++) {
                answer[i][maxCol] = value++;
            }
            maxCol--;

            // 왼쪽으로 이동
            for (int i = maxCol; i >= minCol; i--) {
                answer[maxRow][i] = value++;
            }
            maxRow--;

            // 위로 이동
            for (int i = maxRow; i >= minRow; i--) {
                answer[i][minCol] = value++;
            }
            minCol++;
        }

        return answer;
    }
}

