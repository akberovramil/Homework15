 enum LiftingCapacity {
    N1(0.0, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null);
    private final Double lowerLimit;
    private final Double upperLimit;

    LiftingCapacity(Double lowerLimit, Double upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("����������������:");
        if (lowerLimit != null) {
            stringBuilder.append(" �� ").append(lowerLimit).append(" ����");
        }
        if (upperLimit != null) {
            stringBuilder.append(" �� ").append(upperLimit).append(" ����");
        }
        return stringBuilder.toString();
    }
}
