import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 7, 9};
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                System.out.println("Duplicate: " + arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }
    }
}