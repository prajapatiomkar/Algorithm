import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                // By changing less than sign(<) turn into greater than sign(>) you will get Reversed array. 
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}