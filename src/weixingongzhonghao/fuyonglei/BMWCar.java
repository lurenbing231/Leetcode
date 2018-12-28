package weixingongzhonghao.fuyonglei;

import org.junit.Test;

public class BMWCar extends Car {
    public void make(int i) {
        System.out.println("ÖÆÔìBMWÆû³µ");
    }

    @Test
    public void test() {
        BMWCar bmwCar = new BMWCar();
        bmwCar.make(1);
        bmwCar.make();
        bmwCar.make("zl");
    }
}
