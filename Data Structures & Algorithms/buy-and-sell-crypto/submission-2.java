class Solution {
    public int maxProfit(int[] arr) {
        int profit=0;
        int n=arr.length;
        int max=arr[n-1];

        for(int i=n-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            int temp=max-arr[i];
            profit=Math.max(profit,temp);
        }
        return profit;
    }
}
