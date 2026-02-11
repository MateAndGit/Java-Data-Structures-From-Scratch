package linear.arraylist.problem.leetcode;

import java.util.ArrayList;

public class Leet1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }

        return ans;
    }
}
