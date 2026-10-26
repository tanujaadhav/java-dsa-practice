public class SwapEnds {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 3};

        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}