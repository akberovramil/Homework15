public class CargoCar extends Car implements Competing{

    private LiftingCapacity liftingCapacity;

    public CargoCar(String brand, String model, double engineVolume, LiftingCapacity liftingCapacity) {
        super(brand, model, engineVolume);
        this.liftingCapacity = liftingCapacity;
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
        System.out.println("�������������� ���-���� ��� ����������");
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

    @Override
    public void printType() {
        if (liftingCapacity == null) {
            System.out.println("������ ������������");
        } else {

            System.out.println("���������������� ������ " + liftingCapacity);
        }
    }
}
