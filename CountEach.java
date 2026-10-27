import java.util.HashMap;

public class CountEach {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 7, 9, 7};
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        System.out.println(counts);
    }
}