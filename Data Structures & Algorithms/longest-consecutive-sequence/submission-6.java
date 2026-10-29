class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashMap<Integer,Boolean> map = new HashMap<>();
        HashMap<Integer,Integer> freq = new HashMap<>();

        int n=nums.length;


        for(int i=0;i<n;i++){
            map.put(nums[i],false);
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i]-1)){
                map.put(nums[i],true);
            }
        }

        int temp=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(!map.get(nums[i])){
                continue;
            }
            int target=nums[i];
            while(map.containsKey(target)){
                temp++;
                count=Math.max(temp,count);
                target++;
            }
            temp=0;
        }

        return count;
    }
}
