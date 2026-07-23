class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;

        while (i <= right) {
            if (nums[i] == 0) {
                // Swap nums[i] and nums[left]
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;

                left++;
                i++;
            }
            else if (nums[i] == 2) {
                // Swap nums[i] and nums[right]
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;

                right--;
            }
            else { // nums[i] == 1
                i++;
            }
        }
    }
}
