public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 11};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " and " + arr[right]);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}