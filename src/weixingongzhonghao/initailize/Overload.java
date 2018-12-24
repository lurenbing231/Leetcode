package weixingongzhonghao.initailize;

import org.junit.Test;

public class Overload {//《Java编程思想》的例子
    void z1(char x) { System.out.print("z1(char) "); }
    void z1(byte x) { System.out.print("z1(byte) "); }
    void z1(short x) { System.out.print("z1(short) "); }
    void z1(int x) { System.out.print("z1(int) "); }
    void z1(long x) { System.out.print("z1(long) "); }
    void z1(float x) { System.out.print("z1(float) "); }
    void z1(double x) { System.out.print("z1(double) "); }

    void z2(byte x) { System.out.print("z2(byte) "); }
    void z2(short x) { System.out.print("z2(short) "); }
    void z2(int x) { System.out.print("z2(int) "); }
    void z2(long x) { System.out.print("z2(long) "); }
    void z2(float x) { System.out.print("z2(float) "); }
    void z2(double x) { System.out.print("z2(double) "); }

    void z3(short x) { System.out.print("z3(short) "); }
    void z3(int x) { System.out.print("z3(int) "); }
    void z3(long x) { System.out.print("z3(long) "); }
    void z3(float x) { System.out.print("z3(float) "); }
    void z3(double x) { System.out.print("z3(double) "); }

    void z4(int x) { System.out.print("z4(int) "); }
    void z4(long x) { System.out.print("z4(long) "); }
    void z4(float x) { System.out.print("z4(float) "); }
    void z4(double x) { System.out.print("z4(double) "); }

    void z5(long x) { System.out.print("z5(long) "); }
    void z5(float x) { System.out.print("z5(float) "); }
    void z5(double x) { System.out.print("z5(double) "); }

    void z6(float x) { System.out.print("z6(float) "); }
    void z6(double x) { System.out.print("z6(double) "); }

    void z7(double x) { System.out.print("z7(double) "); }

    @Test
    public void testOverload() {
        System.out.println("int:" );
        z1(5);
        z2(5);
        z3(5);
        z4(5);
        z5(5);
        z6(5);
        z7(5);
    }
}
