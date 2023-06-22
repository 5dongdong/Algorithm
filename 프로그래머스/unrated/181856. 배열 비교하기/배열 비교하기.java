class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = calculateSum(arr1);
        int sum2 = calculateSum(arr2);
        
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            if (sum1 != sum2) {
                return sum1 > sum2 ? 1 : -1;
            } else {
                return 0;
            }
        }
    }
    
    private int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
