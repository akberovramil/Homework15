public class DriverD<D extends Bus> extends Driver {

    public DriverD(String fullName, boolean licenseYes, int experienceDriver) {
        super(fullName, licenseYes, experienceDriver);
    }
    @Override
    public void goDriver() {
        System.out.println("¬одитель автобуса " + getFullName() + " начинает движение");
    }
    @Override
    public void stopDriver() {
        System.out.println("¬одитель автобуса " + getFullName() + " заканчивает движение");
    }
    @Override
    public void refuelCar() {
        System.out.println("¬одитель автобуса " + getFullName() + " заправл€етс€");
    }
    public void displayInfo(D car) {
        System.out.println("¬одитель " + getFullName() + " управл€ет автобусом " + car + " и будет участвовать в заезде");
    }
}
