package weixingongzhonghao.initailize;

class Car {
    Car() {//�޲ι�������Ĭ�Ϲ�������
        this("BMW");//���ù�����Car(String name)
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
