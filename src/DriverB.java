public class DriverB<B extends PassengerCar> extends Driver {
    public DriverB(String fullName, boolean licenseYes, int experienceDriver) {
        super(fullName, licenseYes, experienceDriver);
    }
    public DriverB() {
    }
    @Override
    public void goDriver() {
        System.out.println("Водитель легковушки " + getFullName() + " начинает движение");
    }
    @Override
    public void stopDriver() {
        System.out.println("Водитель легковушки " + getFullName() + " заканчивает движение");
    }
    @Override
    public void refuelCar() {
        System.out.println("Водитель легковушки " + getFullName() + " заправляется");
    }
    public void displayInfo(B car) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + car + " и будет участвовать в заезде" );
    }
}
