class Solution {
    public int maxArea(int[] height) {
        int left =0;
         int right = height.length - 1;
        int result = 0;

        while (left < right){

        
            int d= right - left;
            int m= Math.min(height[left], height[right]);
            int f= d*m;

            if (f > result) {
                result = f;

            }
                
            else if (height[left]> height[right]){
                right--;
            }
                
            else{
                left ++;
            }     
        
        }
        return result;
    }
}
