 enum BusCapacity {
    LEVEL_1(0, 10),
    LEVEL_2(11, 25),
    LEVEL_3(40, 50),
    LEVEL_4(60, 80),
    LEVEL_5(100, 120);
    private final Integer minBusCapacity;
    private final Integer maxBusCapacity;
    BusCapacity(Integer minBusCapacity, Integer maxBusCapacity) {
        this.minBusCapacity = minBusCapacity;
        this.maxBusCapacity = maxBusCapacity;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Вместимость: ");
        if (minBusCapacity != null) {
            stringBuilder.append(" от ").append(minBusCapacity).append(" человек");
        }
        if (maxBusCapacity != null) {
            stringBuilder.append(" до ").append(maxBusCapacity).append(" человек");
        }
        return stringBuilder.toString();
    }
}
