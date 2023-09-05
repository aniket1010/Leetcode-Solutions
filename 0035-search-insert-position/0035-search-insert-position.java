//Date Sept 01 2023

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int high = nums.length-1;
        int low = 0;
        int ans =high+1;
        while(low<=high){
            int mid = low + (high-low)/2;
           if(nums[mid]>=target){
               ans = mid;
               high=mid-1;
           }else{
               low = mid+1;
           }
        }

        return ans;

    }
}