class Solution {

    public int lowerbound(int [] nums,int n,int x){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=0){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

    }

    public int upperbound(int []nums,int n,int x){
    
        int low=0,high=n-1;
        int ans=n;

        while(low<=high){
            int mid=(low + high)/2;

            if(nums[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return n-ans;
    }
    public int maximumCount(int[] nums) {
        

        int n=nums.length;


        int lower= lowerbound(nums,n,0);
        int upper= upperbound(nums,n,0);
        System.out.println(upper);

        return Math.max(lower,upper);
    }
}