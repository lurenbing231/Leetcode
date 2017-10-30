package TwoFind;

/**
 * Created by zhaoliang on 2017/10/30.
 */
public class Test {
    @org.junit.Test
    public void test(){
        int[][] array = {{1,3,5,7},{2,4,6,8},{9,10,11,12}};
        int target = 13;
        Solution solution = new Solution();
        System.out.println(solution.Find(target,array));
    }
}
