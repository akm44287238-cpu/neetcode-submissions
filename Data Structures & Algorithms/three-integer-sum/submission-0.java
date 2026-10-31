class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> check=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int k=n-1;k>1;k--){
            int target=(-1)*nums[k];
            int i=0,j=k-1;
            while(i<j){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    if(!check.contains(temp)){
                        ans.add(temp);
                        check.add(temp);
                    }
                    i++;
                    j--;
                }else if(sum>target){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return ans;
    }
}