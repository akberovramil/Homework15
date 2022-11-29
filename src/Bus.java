public class Bus extends Car implements Competing {

    private BusCapacity busCapacity;

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }

    @Override
    public void startMove() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void endMove() {
        System.out.println("Автобус заканчивает движение");
    }


    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel();
    }

    @Override
    public void pitStop() {
        System.out.println("Реализация пит-стопа для автобусов");
    }

    @Override
    public String bestLapTime() {
        System.out.println("Реализация лучшего времи круга для автобусов");
        return null;
    }

    @Override
    public String maxSpeed() {
        System.out.println("Реализация максимальной скорости для автобусов");
        return null;
    }

    @Override
    public void printType() {
        if (busCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость автобуса " + busCapacity);
        }
    }

    }

