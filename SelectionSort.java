public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int getMax = getMaxIndex(arr, 0, last);
            swap(arr, getMax, last);
        }
        return arr;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
