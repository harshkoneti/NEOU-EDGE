package recursion;

public class reccursionsort {
    public static boolean issorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] <= arr[idx + 1]) {
            return false;
        }
        return issorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3 };
        System.out.println(issorted(arr, 0));

    }
}
