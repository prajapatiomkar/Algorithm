public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,4,2,3,1};
        int target = 24;
        search(arr,target);
    }
    static void search(int[] arr,int target){
        boolean Found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target+" is present at "+i+" index.");
                Found = true;
            }
        }
        if(Found == false){
            System.out.println("Target element not present in the given array.");
        }


    }

}
