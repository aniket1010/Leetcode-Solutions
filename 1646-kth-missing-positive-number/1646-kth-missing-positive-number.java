class Solution {

    private int missing(int[]arr,int mid){
        return arr[mid]-1-mid;
    }

    public int findKthPositive(int[] arr, int k) {
        
        int low = 0;
        int n = arr.length;
        if(k<arr[0])return k;
        int high = n-1;
        int maxi=-1;
        int ind = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(missing(arr,mid)<k){
                if(arr[mid]>maxi){
                    maxi=arr[mid];
                    ind = mid;
                }
                low=mid+1;
            }else{
                high = mid -1;
            }
        }
        return maxi+=(k-missing(arr,ind));
    }
}