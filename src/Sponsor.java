public class Sponsor {

    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public void toSponsorRace() {
        System.out.printf("������� \"%s\" �������������� ����� �� %d%n", name, amount);
    }
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
