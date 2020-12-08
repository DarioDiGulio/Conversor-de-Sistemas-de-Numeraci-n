package Numbers;

import Utils.CustomMath;

public class Decimal extends Number {
    public static final int base = 10;

    public Decimal(String value) {
        super(NumberSystem.DECIMAL, value);
    }

    @Override
    public Number add(Number number) {
        Decimal result = null;

        try {
            int added = Integer.parseInt(super.getValue()) + Integer.parseInt(number.getValue());
            result = new Decimal(added + "");
        } catch (NumberFormatException e) {
            throw new NumberFormatException(e.getMessage());
        }

        return result;
    }

    @Override
    public Number subtract(Number number) {
        Decimal result = null;

        try {
            int added = Integer.parseInt(super.getValue()) - Integer.parseInt(number.getValue());
            result = new Decimal(added + "");
        } catch (NumberFormatException e) {
            throw new NumberFormatException(e.getMessage());
        }

        return result;
    }

    @Override
    public Number convert(NumberSystem numberSystem) {
        Number result = null;

        try {
            switch (numberSystem){
                case BINARY:
                    result = CustomMath.convertDecimalToBinary(this);
                    break;
                case DECIMAL:
                    result = this;
                    break;
                case HEXADECIMAL:
                    result = CustomMath.convertDecimalToHexadecimal(this);
                    break;
            }
        } catch (NumberFormatException e){
          throw new NumberFormatException(e.getMessage());
        }

        return result;
    }
}
