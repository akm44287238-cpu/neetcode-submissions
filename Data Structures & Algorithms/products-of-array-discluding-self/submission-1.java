class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int proz=1;
        int n=nums.length;
        int countZero=0;
        for(int i=0;i<n;i++){
            product=product*nums[i];
            if(nums[i]==0){
                countZero++;
            }
            if(nums[i]!=0){
                proz=proz*nums[i];
            }
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                ans[i]=product/nums[i];
            }else if(countZero<2){
                ans[i]=proz;
            }else{
                ans[i]=0;
            }
        }
        return ans;
    }
}  
