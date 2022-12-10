public class Bus extends Car implements Competing {

    private BusCapacity busCapacity;


    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }



    @Override
    public void startMove() {
        System.out.println("������� �������� ��������");
    }

    @Override
    public void endMove() {
        System.out.println("������� ����������� ��������");
    }


    public void passDiagnostics(DriverD driverD) {
        System.out.println("������� " + getBrand() + " � ����������� �� ���������");
    }

    @Override
    public String toString() {
        return "������� " + getBrand() + ", ������ " + getModel();
    }

    @Override
    public void pitStop() {
        System.out.println("���������� ���-����� ��� ���������");
    }

    @Override
    public String bestLapTime() {
        System.out.println("���������� ������� ����� ����� ��� ���������");
        return null;
    }

    @Override
    public String maxSpeed() {
        System.out.println("���������� ������������ �������� ��� ���������");
        return null;
    }


    public void printType() {
        if (busCapacity == null) {
            System.out.println("������ ������������");
        } else {
            System.out.println("����������� �������� " + busCapacity);
        }
    }

    }

