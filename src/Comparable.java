public interface Comparable {
    public default boolean isLessThan(Comparable compareTo) {
        return getValue() < compareTo.getValue();
    }
    public default boolean isGreaterThan(Comparable compareTo) {
        return getValue() > compareTo.getValue();
    }

    public double getValue();
}
