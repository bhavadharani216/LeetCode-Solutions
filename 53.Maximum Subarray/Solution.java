class Solution {
    public int maxSubArray(int[] nums) {

        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int temp=currentsum+nums[i];

            if(temp< nums[i]){
                currentsum=nums[i];
            }
            else{
                currentsum=temp;
            }
        
        if(maxsum < currentsum){
            maxsum = currentsum;
        }
        }
        return maxsum;

    }
}