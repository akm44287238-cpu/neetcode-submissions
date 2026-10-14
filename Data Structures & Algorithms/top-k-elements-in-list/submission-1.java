class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        HashMap<Integer,ArrayList<Integer>> group=new HashMap<>();
        int freq=0,num=nums[0];

        for(int i=0;i<n;i++){
            if(nums[i]==num){
                freq++;
            }else{
                if(group.containsKey(freq)){
                    group.get(freq).add(nums[i-1]);
                }else{
                    group.put(freq,new ArrayList<>());
                    group.get(freq).add(nums[i-1]);
                }
                freq=1;
                num=nums[i];
                
            }
        }    
        if(group.containsKey(freq)){
            group.get(freq).add(nums[n-1]);
        }else{
            group.put(freq,new ArrayList<>());
            group.get(freq).add(nums[n-1]);
        }

        int[] ans=new int[k];
        int count=0;
        for(int i=n;i>0;i--){
            if (k==count) break;
            if(group.containsKey(i)){
                for(int j=0;j<group.get(i).size();j++){
                    ans[count]=group.get(i).get(j);
                    count++;
                }
            }
        }
        return ans;
    }
}
