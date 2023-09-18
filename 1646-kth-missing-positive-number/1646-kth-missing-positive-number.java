class Solution {

    private int missing(int[]arr,int mid){
        return arr[mid]-1-mid;
    }

    public int findKthPositive(int[] arr, int k) {
        
        int low = 0;
        int n = arr.length;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high+k+1;
    }
}