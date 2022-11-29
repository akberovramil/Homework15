public class PassengerCar extends Car implements Competing {

    private BodyType bodyType;




    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMove() {
        System.out.println("Легковой автомобиль начинает движение");
    }

    @Override
    public void endMove() {
        System.out.println("Легковой автомобиль заканчивает движение");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + getBrand() + ", модель " + getModel();
     }

    @Override
    public void pitStop() {
        System.out.println("Реализация пит-стопа для легковушек");
    }

    @Override
    public String bestLapTime() {
        System.out.println("Реализация лучше времери круга для легковушек");
        return null;
    }

    @Override
    public String maxSpeed() {
        System.out.println("Реализация максимальной скорости легковушек");
        return null;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип кузова машины " + bodyType);
        }
    }
}
