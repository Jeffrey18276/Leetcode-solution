class Solution {
public:

    bool canTransform(vector<int> &nums,vector<vector<int>>& queries,int k){
        int n=nums.size();
        vector<int>diff(n+1,0);

        for(int i=0;i<k;i++){
            int start=queries[i][0],end=queries[i][1],val=queries[i][2];

            diff[start]+=val;
            diff[end+1]-=val;
        }
     // vector<int> transformed(nums);
       int sum{};
        
        for(int i=0;i<n;i++){
            sum+=diff[i];
            if(nums[i]>sum)return false;
            

        }
        return true;
    }
    int minZeroArray(vector<int>& nums, vector<vector<int>>& queries) {
        
        int q=queries.size();
        int low=0,high=q;
        int ans=-1;

        while(low<=high){
            int mid=low + (high-low)/2;

            if(canTransform(nums,queries,mid)){
                ans=mid;
                high=mid-1;
              
            }else{
                low=mid+1;
                
            }
            
        }
        return ans;
    }
};