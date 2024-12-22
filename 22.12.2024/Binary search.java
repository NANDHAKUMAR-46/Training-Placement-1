import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;

        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Key " + key + " is " + (found ? "found" : "not found"));
    }
}
