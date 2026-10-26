class Solution {
    public boolean hasDuplicate(int[] nums) {
        int min=nums[0],max=nums[0];
        int n=nums.length;

        for(int i=1;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }else if(max<nums[i]){
                max=nums[i];
            }
        }

        int[] arr=new int[max-min+1];
        int l=max-min+1;

        for(int i=0;i<n;i++){
            arr[nums[i]-min]++;
        }

        for(int i=0;i<l;i++){
            if(arr[i]>1) return true;
        }
        return false;
    }
}