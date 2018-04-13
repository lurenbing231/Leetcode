package nengyuanwulianwang;

/*
给定一个长度为n的直方图，我们可以在直方图高低不同的长方形之间画一个更大的长方形，
求该长方形的最大面积。
* */
public class biancheng2 {
    public int largestRectangleArea(int[] height) {
        int len = height.length;
        int max_size = 0;
        for (int i = 0; i < len; i++) {
            int min_height = height[i];
            int current_size = min_height;
            for (int j = i; j < len; j++) {
                if (height[j] < min_height) min_height = height[j];
                current_size = min_height * (j - i + 1);
                if (current_size > max_size) max_size = current_size;
            }
        }
        return max_size;
    }
}
