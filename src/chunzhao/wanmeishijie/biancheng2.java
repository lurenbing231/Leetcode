package chunzhao.wanmeishijie;
/*写一个实现栈基本功能的类，实现以下接口。
interface IStack{
        void push(int data);         //向栈中压数据
        int pop();                   //从栈顶取数据
        int min();                   //获取栈中所有数据的最小值
        int max();                   //获取栈中所有数据的最大值
}
栈中存储整型数据。要求所有函数的时间复杂度均为O(1)，空间复杂度不限。
输入
n和n个整数
输出
将n个数依次入栈，然后执行一次出栈操作，然后输出最大值最小值，用逗号分隔。
样例输入
5 1 2 3 -1 4
样例输出
3,-1*/
import java.util.Scanner;
import java.util.Stack;

public class biancheng2 {
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static Stack<Integer> res = new Stack<>();
    static Stack<Integer> datamin = new Stack<>();
    static Stack<Integer> datamax = new Stack<>();

    private static void push(int data) {
        if (min >= data) {
            min = data;
            datamin.add(data);
        }
        if (max <= data){
            max = data;
            datamax.add(data);
        }
        res.push(data);
    }

    static int pop() {
        int tmp = res.pop();
        if (min == tmp) {
            datamin.pop();
            min = datamin.peek();
        }
        if (max == tmp) {
            datamax.pop();
            max = datamax.peek();
        }
        return tmp;
    }

    static int min() {
        return min;
    }

    static int max() {
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            push(sc.nextInt());
        }
        int s = pop();
        System.out.println(max()+","+min());
    }
}
