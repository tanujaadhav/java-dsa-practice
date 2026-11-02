import java.util.HashMap;

public class TwoSumMap {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 12};
        int target = 17;

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (seen.containsKey(need)) {
                System.out.println(need + " and " + arr[i]);
            }
            seen.put(arr[i], i);
        }
    }
}
