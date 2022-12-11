import java.util.ArrayList;

public class PassengerCar extends Car implements Competing {

    private BodyType bodyType;
    private ArrayList<Driver> driverArrayList;
    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }
    public void passDiagnostics(DriverB driverB) {
        if (driverB.licenseYes == true) {
            System.out.println("������ �����������");
        } else {
            throw new RuntimeException("�������� ��� ����");
        }
    }
    @Override
    public void startMove() {
        System.out.println("�������� ���������� �������� ��������");
    }
    @Override
    public void endMove() {
        System.out.println("�������� ���������� ����������� ��������");
    }
    @Override
    public String toString() {
        return "�������� ���������� " + getBrand() + ", ������ " + getModel();
     }

    @Override
    public void pitStop() {
        System.out.println("���������� ���-����� ��� ����������");
    }
    @Override
    public String bestLapTime() {
        System.out.println("���������� ����� ������� ����� ��� ����������");
        return null;
    }
    @Override
    public String maxSpeed() {
        System.out.println("���������� ������������ �������� ����������");
        return null;
    }
    public void printType() {
        if (bodyType == null) {
            System.out.println("������ ������������");
        } else {
            System.out.println("��� ������ ������ " + bodyType);
        }
    }
}
