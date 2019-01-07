package leetcode;

public class leetcode45 {
    public int jump(int[] nums) {
        int jump = 0;
        int end = 0;
        int maxEnd = 0;
        for (int i = 0; i < nums.length; i++) {
            maxEnd = Math.max(maxEnd, i + nums[i]);
            if (i == end) {
                jump++;
                end = maxEnd;
            }
        }
        return jump;
    }
}
