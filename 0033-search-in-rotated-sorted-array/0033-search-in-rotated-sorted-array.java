class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid=0;
        while(low<=high){

            mid = low + (high - low)/2;

            if(nums[mid]==target)return mid;

            // left is Sorted
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid])
                    high = mid-1;
                else
                    low = mid+1;

             // right is sorted           
            }else{
                if(target >= nums[mid] && target <= nums[high])
                    low = mid+1;
                else
                    high = mid-1;    
            }
        }
        return -1;
        
    }
}