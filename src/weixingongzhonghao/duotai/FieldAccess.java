package weixingongzhonghao.duotai;

class Car {
    public int id = 0;

    public int getId() {
        return id;
    }
}

class BMWCar extends Car {
    public int id = 1;

    public int getId() {
        return id;
    }

    public int getSuperId() {
        return super.id;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Car car = new BMWCar();
        System.out.println("car.id=" + car.id + " " + "car.getId()=" + car.getId());
        BMWCar bmwCar = new BMWCar();
        System.out.println("bmwCar.id=" + bmwCar.id + " "
                + "bmwCar.getId()=" + bmwCar.getId() + " "
                + "bmwCar.getSuperId()=" + bmwCar.getSuperId());
    }
}


