class Solution {
    public double findMaxAverage(int[] nums, int k) {
      // initialising sum var 
        int sum =0;
      // add sum till k
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
      // initilaise maxSum to compare the max sum we find using sliding window
        int maxSum = sum;
        for(int i=k;i<nums.length ; i++){
            sum+=nums[i];
            sum-=nums[i-k];
            maxSum = Math.max(maxSum,sum);
        }
      
        return (double)maxSum/k;
    }
}
