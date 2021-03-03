package recusion;

public class Recusion {
    static int binarySearch(int[] arr, int value, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, value, low, mid - 1);
            return binarySearch(arr, value, mid + 1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(binarySearch(arr,4,0, arr.length-1));
    }
}
