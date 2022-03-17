class SortedArray {

    public static boolean checkSorted(int arr[], int i, int n) {
        //base case//
        if(i == n-1){
            return true;
        }
        if(arr[i] < arr[i+1] && checkSorted(arr, i+1, n)){
            return true;
        }
        return false;
    }

    public static boolean checkSorted2(int arr[], int n){
        if(n == 1 || n == 0) {
            return true;
        }
        if(arr[0] < arr[1] && checkSorted2(arr+1, n-1)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int[] input = {1,3,4,5,6,7,8,9};
        int n = input.length;
        boolean isSorted = checkSorted(input, 0, n);
        boolean isSorted2 = checkSorted2(input, n);
        System.out.println(isSorted == true?"The input array is sorted": "The input array is not sorted");
        System.out.println(isSorted2 == true?"The input array is sorted": "The input array is not sorted");
    }
}