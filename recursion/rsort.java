package recursion;

public class rsort {

    public static boolean arrstr(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] <= arr[idx + 1]) {
            return arrstr(arr, idx + 1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4 };
        System.out.println(arrstr(arr, 0));

    }

}
