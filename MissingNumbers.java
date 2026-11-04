import java.util.HashSet;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr ={10,11,13,14};

        HashSet<Integer> seen = new HashSet<>();
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            seen.add(arr[i]);
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int num = min; num <= max; num++) {
            if (!seen.contains(num)) {
                System.out.println(num);
            }
        }
    }
}