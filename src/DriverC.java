public class DriverC<C extends CargoCar> extends  Driver{

    public DriverC(String fullName, boolean licenseYes, int experienceDriver) {
        super(fullName, licenseYes, experienceDriver);
    }

    @Override
    public void goDriver() {
        System.out.println("�������� ��������� " + getFullName() + " �������� ��������");
    }

    @Override
    public void stopDriver() {
        System.out.println("�������� ��������� " + getFullName() + " ����������� ��������");
    }

    @Override
    public void refuelCar() {
        System.out.println("�������� ��������� " + getFullName() + " ������������");
    }

    public void displayInfo(C car) {
        System.out.println("�������� " + getFullName() + " ��������� ����������� " + car + " � ����� ����������� � ������" );
    }
}
