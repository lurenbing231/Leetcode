package weixingongzhonghao.initailize;

class Car {
    Car() {//无参构造器（默认构造器）
        this("BMW");//调用构造器Car(String name)
        System.out.println("Car");
    }

    Car(String name) {
        System.out.println("CarName:" + name);
    }

    Car getCar() {
        return this;
    }

    static int i;
    static {
        i = 47;
    }
}
