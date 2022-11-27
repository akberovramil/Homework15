public class CargoCar extends Car implements Competing{

    public CargoCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовой автомобиль начинает движение");
    }

    @Override
    public void endMove() {
        System.out.println("Грузовой автомобиль заканчивает движение");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " + getBrand() + ", модель " + getModel();
    }

    @Override
    public void pitStop() {
        System.out.println("Переопределние пит-стоп для грузовиков");
    }

    @Override
    public String bestLapTime() {
        System.out.println("Переопределение лучшего времени круга для грузовиков");
        return null;
    }

    @Override
    public String maxSpeed() {
        System.out.println("Переопределние максимальной скорости для грузовиков");
        return null;
    }
}
