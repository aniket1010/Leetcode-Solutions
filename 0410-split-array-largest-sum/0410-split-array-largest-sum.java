class Solution {
    public int splitArray(int[] nums, int k) {

        int n = nums.length;
        int low =-1;
        int high=0;
        for(int a: nums){
            high+=a;
            low=Math.max(low,a);
        }
        while(low<=high){
            int mid = low +(high-low)/2;
            if(isPossible(nums,k,mid))
                high=mid-1;
            else
                low=mid+1;    
        }
        return low;
        
    }
    private boolean isPossible(int[]nums,int k , int maxSum){
        int sum=nums[0];
        int k2=1;
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]<=maxSum){
                sum+=nums[i];
            }else{
                k2++;
                sum=nums[i];
            }
        }
        return k2<=k;
    }
}