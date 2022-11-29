public enum BodyType {
    SEDAN("�����"),
        HATCHBACK("�������"),
        COUPE("����"),
        UNIVERSAL("���������"),
        OFF_ROAD("�����������"),
        CROSSOVER("���������"),
        PICKUP("�����"),
        VAN("������"),
    MINIVAN("�������");

    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "��� ������ " + bodyType;
    }
}
