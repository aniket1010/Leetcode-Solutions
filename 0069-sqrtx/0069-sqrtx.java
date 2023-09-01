class Solution {
    public int mySqrt(int x) {
        
        if(x==0||x==1)return x;
        
        int low=0,high=x/2;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if((long)mid*mid==x)return mid;
            if((long)mid*mid>x)high=mid-1;else low=mid+1;
        
       
    }
        return high;
}
}