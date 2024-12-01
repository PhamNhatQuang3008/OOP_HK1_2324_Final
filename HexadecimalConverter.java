public class HexadecimalConverter extends AbstractNumberConverter {
    public HexadecimalConverter(OriginalNumber originalNumber) {
        super(originalNumber);
        originalNumber.addConverter(this);
    }

    @Override
    public String convert() {
        int decimal = Integer.parseInt(toDecimal());
        return Integer.toHexString(decimal).toUpperCase();
    }

    @Override
    public void display() {
        System.out.println("Hexadecimal: " + convertedNumber);
    }
}
