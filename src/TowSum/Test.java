package TowSum;

/**
 * Created by zhaoliang on 2017/10/19.
 */
public class Test {
    @org.junit.Test
    public void test1(){
        int[] sums = {1,3,5,7,9};
        int target =  8;
        //BruteForce bruteForce = new BruteForce();
        //int[] ints = bruteForce.twoSum(sums,target);
        //TwopassHashTable twopassHashTable = new TwopassHashTable();
        //int[] ints = twopassHashTable.twoSum(sums,target);
        OnepassHashTable onepassHashTable = new OnepassHashTable();
        int[] ints = onepassHashTable.twoSum(sums,target);
        System.out.println(ints[0]+","+ints[1]);
    }
}
