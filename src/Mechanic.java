public class Mechanic<T extends Car> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public void service(T t) {
        System.out.println("Проведен ремонт");
    }

    public void repair(T t) {
        System.out.println("Машина починена");

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }
}

