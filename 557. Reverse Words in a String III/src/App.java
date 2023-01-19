import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String s =  "Let's take LeetCode contest";

        Solution out = new Solution ();
        System.out.println(out.reverseWords(s));
    }
}

class Solution {

    public String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] chArray = s.toCharArray();
        System.out.println(chArray);
        int len = s.length();
        for (int strIndex = 0; strIndex <= len; strIndex++) {
            if (strIndex == len || chArray[strIndex] == ' ') {
                int startIndex = lastSpaceIndex + 1;
                int endIndex = strIndex - 1;
                while (startIndex < endIndex) {
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = strIndex;
            }
        }
        return new String(chArray);
    }

}
