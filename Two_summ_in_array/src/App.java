import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        char[] nums =  {'h', 'e', 'l', 'l', 'o'};

        Solution out = new Solution ();
        out.reverse(nums);
        System.out.println("" + new String(nums));
    }
}

class Solution {
    public void reverse(char[] s) {
       int i = 0; 
       int j= s.length -1;
       while (i<j) {
        char tmp = s[i];
        s[i]=s[j];
        s[j]=tmp;
        i++;
        j--;
       }
   }
}
