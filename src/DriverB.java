public class DriverB<B extends PassengerCar> extends Driver {
    public DriverB(String fullName, boolean licenseYes, int experienceDriver) {
        super(fullName, licenseYes, experienceDriver);
    }
    public DriverB() {
    }
    @Override
    public void goDriver() {
        System.out.println("�������� ���������� " + getFullName() + " �������� ��������");
    }
    @Override
    public void stopDriver() {
        System.out.println("�������� ���������� " + getFullName() + " ����������� ��������");
    }
    @Override
    public void refuelCar() {
        System.out.println("�������� ���������� " + getFullName() + " ������������");
    }
    public void displayInfo(B car) {
        System.out.println("�������� " + getFullName() + " ��������� ����������� " + car + " � ����� ����������� � ������" );
    }
}
