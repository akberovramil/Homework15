public class CargoCar extends Car implements Competing{

    private LiftingCapacity liftingCapacity;



    public CargoCar(String brand, String model, double engineVolume, LiftingCapacity liftingCapacity) {
        super(brand, model, engineVolume);
        this.liftingCapacity = liftingCapacity;
    }


    public void passDiagnostics(DriverC driverC) {
        if (driverC.licenseYes == true) {
            System.out.println("Прошли диагностику");
        } else {
            throw new RuntimeException("Неправильный тип прав");
        }

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


    public void printType() {
        if (liftingCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {

            System.out.println("Грузоподъемность машины " + liftingCapacity);
        }
    }
}
