public class DriverD<D extends Bus> extends Driver {

    public DriverD(String fullName, boolean licenseYes, int experienceDriver) {
        super(fullName, licenseYes, experienceDriver);
    }
    @Override
    public void goDriver() {
        System.out.println("�������� �������� " + getFullName() + " �������� ��������");
    }
    @Override
    public void stopDriver() {
        System.out.println("�������� �������� " + getFullName() + " ����������� ��������");
    }
    @Override
    public void refuelCar() {
        System.out.println("�������� �������� " + getFullName() + " ������������");
    }
    public void displayInfo(D car) {
        System.out.println("�������� " + getFullName() + " ��������� ��������� " + car + " � ����� ����������� � ������");
    }
}
