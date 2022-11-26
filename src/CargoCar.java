public class CargoCar extends Car implements Competing{

    public CargoCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public String pitStop() {
        System.out.println("�������������� ���-���� ��� ����������");
        return null;
    }

    @Override
    public String bestLapTime() {
        System.out.println("��������������� ������� ������� ����� ��� ����������");
        return null;
    }

    @Override
    public String maxSpeed() {
        System.out.println("�������������� ������������ �������� ��� ����������");
        return null;
    }
}
