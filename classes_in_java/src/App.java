import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums =  {0,1,0,3,12};
        Solution out = new Solution ();
        System.out.println(Arrays.toString(out.moveZeroes(nums)));
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public int[] moveZeroes(int[] nums) {
       int snowBallSize = 0; 
       for (int i=0;i<nums.length;i++){
           if (nums[i]==0){
               snowBallSize++; 
           }
           else if (snowBallSize > 0) {
               int t = nums[i];
               nums[i]=0;
               nums[i-snowBallSize]=t;
           }
       }
       return nums;
   }
}