class Solution {
    public int trap(int arr[]) {
        // code here
        int sum=0;
        int n=arr.length;
        int max=arr[0];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }else{
                if(i==n-1 && arr[i]<max){
                    int revMax=arr[n-1];
                    int revInd=n-1;
                    for(int j=n-2;j>ind;j--){
                        sum=sum-max+arr[j];
                        if(arr[j]>revMax){
                            revMax=arr[j];
                            revInd=j;
                        }else{
                            sum=sum+revMax-arr[j];
                        }
                    }
                }else{
                    sum=sum+max-arr[i];
                }
            }
        }
        return sum;
    }
}