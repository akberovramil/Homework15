public class Main {
    public static void main(String[] args) {
        System.out.println("�������� ������� 1");
        PassengerCar lada = new PassengerCar("����", "������", 1.5);
        PassengerCar bmw = new PassengerCar("���", "��� 5", 2.5);
        PassengerCar mazda = new PassengerCar("�����", "3", 1.8);
        PassengerCar skoda = new PassengerCar("�����", "2", 1.5);
        CargoCar gazel = new CargoCar("������", "�����", 5.6);
        CargoCar audi = new CargoCar("����", "27", 7.6);
        CargoCar kamaz = new CargoCar("�����", "6", 7.7);
        CargoCar mers = new CargoCar("��������", "�2", 7.7);
        Bus iz = new Bus("��", "������", 10.2);
        Bus dragon = new Bus("������", "�����", 10.7);
        Bus ikarus = new Bus("������", "��������", 10.7);
        Bus paz = new Bus("���", "23-24", 9.5);
        System.out.println(lada.toString());
        System.out.println(gazel.toString());
        System.out.println(iz.toString());
        dragon.endMove();
        audi.startMove();

        DriverB ramil = new DriverB<>("������� ������ ���������", true, 2);
        ramil.displayInfo(lada);
        System.out.print("");
        DriverC arslan = new DriverC<>("������� ������ ����������", true, 1);
        arslan.displayInfo(kamaz);
        DriverD ruslan = new DriverD<>("��������� ������ ����������", true, 3);
        ruslan.displayInfo(ikarus);




    }
}
