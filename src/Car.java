import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private HashSet<Car> carArrayList;
    private final HashSet<Sponsor> sponsorsList = new HashSet<>();
    private HashSet<Driver> driverArrayList = new HashSet<>();
    private final HashSet<Mechanic> mechanics = new HashSet<>();

    public Car(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Марка некорректная, введите правильные данные";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Модель некорректная , введите правильные данные";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            System.out.println("Объем двигателя некоррктный, введите правильные данный");
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Car() {

    }

    public void passDiagnostics() {
    }

    public void startMove() {
        System.out.println("Автомобиль начинает движение");
    }

    public void endMove() {
        System.out.println("Автомобиль заканчивает движение");
    }

    public void addDriver(Driver driver) {

    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public void addSponsors(Sponsor sponsor) {
        sponsorsList.add(sponsor);
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public HashSet<Car> getCarArrayList() {
        return carArrayList;
    }

    public HashSet<Sponsor> getSponsorsList() {
        return sponsorsList;
    }





    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}

