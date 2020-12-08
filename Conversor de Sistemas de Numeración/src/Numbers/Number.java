package Numbers;

abstract public class Number {
    private NumberSystem numberSystem;
    private String value;

    public Number(NumberSystem numberSystem, String value) {
        setNumberSystem(numberSystem);
        setValue(value);
    }

    private void setNumberSystem(NumberSystem numberSystem) {
        this.numberSystem = numberSystem;
    }

    private void setValue(String value) {
        this.value = value;
    }

    public NumberSystem getNumberSystem() {
        return numberSystem;
    }

    public String getValue() {
        return value;
    }

    public abstract Number add(Number number);

    public abstract Number subtract(Number number);

    public abstract Number convert(NumberSystem numberSystem);

}
