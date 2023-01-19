class Solution {
    public int search(int[] nums ={-1,0,3,5,9,12}, int target =9) {
        // Set the left and right boundaries
        int left = 0, right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        if (left > 0 && nums[left - 1] == target) {
            return left - 1;
        } else {
            return -1;
        } 
    }
}
