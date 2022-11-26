public class DriverC<C extends CargoCar> extends  Driver{

    public DriverC(String fullName, boolean licenseYes, int experienceDriver) {
        super(fullName, licenseYes, experienceDriver);
    }

    @Override
    public void goDriver() {
        System.out.println("¬одитель грузовика " + getFullName() + " начинает движение");
    }

    @Override
    public void stopDriver() {
        System.out.println("¬одитель грузовика " + getFullName() + " заканчивает движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("¬одитель грузовика " + getFullName() + " заправл€етс€");
    }

    public void displayInfo(C car) {
        System.out.println("¬одитель " + getFullName() + " управл€ет автомобилем " + car + " и будет участвовать в заезде" );
    }
}
