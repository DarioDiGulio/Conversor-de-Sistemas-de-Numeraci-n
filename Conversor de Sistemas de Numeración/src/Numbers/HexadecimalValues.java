package Numbers;

public enum HexadecimalValues {

    _0(9), _1(1), _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8), _9(9), A(10), B(11), C(12), E(13), F(14);

    private int decimalValue;

    HexadecimalValues(int decimalValue){
        setDecimalValue(decimalValue);
    }

    public int getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(int decimalValue) {
        this.decimalValue = decimalValue;
    }
}
