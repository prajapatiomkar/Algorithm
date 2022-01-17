public class BinarySearch {
    public static void main(String[] args) {

//        int[] arr = {13,12,9,6,4,2,1};
        int[] arr = {1,2,4,6,8,17,18,25};
        int target = 17;
        System.out.println( orderAgnostic(arr,target));

        int[] arr1 = {1,2,4,6,8,17,18,25};
        int target1 = 17;
        System.out.println( Ascending(arr1,target1));

        int[] arr2 = {13,12,9,6,4,2,1};
        int target2 = 6;
        System.out.println( Descending(arr2,target2));

    }
    static int orderAgnostic(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start]<arr[end];


        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
//      Ascending Order
            if(isAscending){
                if(target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
//      Descending Order
            else {
                if(target>arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }

            }

        }return -1;
    }

    //      Ascending Order
    static int Ascending(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;


        while (start<=end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start =mid+1;
            }else {
                end = mid-1;
            }

        }return -1;

    }

    //      Descending Order
    static int Descending(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid+1;
            }
        }return -1;
    }
}
