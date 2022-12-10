public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        PassengerCar lada = new PassengerCar("Лада", "Калина", 1.5, BodyType.SEDAN);
        PassengerCar bmw = new PassengerCar("БМВ", "Икс 5", 2.5, BodyType.COUPE);
        PassengerCar mazda = new PassengerCar("Мазда", "3", 1.8, BodyType.HATCHBACK);
        PassengerCar skoda = new PassengerCar("Шкода", "2", 1.5, BodyType.COUPE);
        CargoCar gazel = new CargoCar("Газель", "Волна", 5.6, LiftingCapacity.N1);
        CargoCar audi = new CargoCar("Ауди", "27", 7.6, LiftingCapacity.N2);
        CargoCar kamaz = new CargoCar("КАМАЗ", "6", 7.7, LiftingCapacity.N3);
        CargoCar mers = new CargoCar("Мерседес", "А2", 7.7, LiftingCapacity.N2);
        Bus iz = new Bus("Иж", "Гигант", 10.2, BusCapacity.LEVEL_5);
        Bus dragon = new Bus("Дракон", "Новый", 10.7, BusCapacity.LEVEL_2);
        Bus ikarus = new Bus("Икарус", "Гармошка", 10.7, BusCapacity.LEVEL_2);
        Bus paz = new Bus("ПАЗ", "23-24", 9.5, BusCapacity.LEVEL_1);
        System.out.println(lada.toString());
        System.out.println(gazel.toString());
        System.out.println(iz.toString());
        dragon.endMove();
        audi.startMove();

        DriverB ramil = new DriverB<>("Акберов Рамиль Дамирович", true, 2);
        ramil.displayInfo(lada);
        System.out.print("");
        DriverC arslan = new DriverC<>("Закиров Арслан Ильгизович", true, 1);
        arslan.displayInfo(kamaz);
        DriverD ruslan = new DriverD<>("Давлетшин Руслан Ильнурович", true, 3);
        lada.passDiagnostics(ramil);
        lada.passDiagnostics(ramil);
        kamaz.passDiagnostics(arslan);
        Car arslMobil = new Car();
        lada.getDriverArrayList(ramil);








    }
}
