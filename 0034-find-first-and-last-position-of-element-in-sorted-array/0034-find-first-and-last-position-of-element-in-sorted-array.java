class Solution {

    public int lowerBound(int[]nums,int target,int n){
        
        int lb = -1;
        int low = 0 , high = n-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]>=target){
                lb = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return lb;
    }
    public int upperBound(int[]nums , int target , int n){
        int ub = n;
        int low = 0 , high = n-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]>target){
                ub = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ub;
    }
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        if(n==0)return new int[] {-1 , -1};
        int lb = lowerBound(nums,target,n);

        if(lb == -1 || nums[lb] != target) return new int [] {-1 , -1};

        int ub = upperBound(nums , target , n);

        return new int []{lb,ub-1};
       
    }
}