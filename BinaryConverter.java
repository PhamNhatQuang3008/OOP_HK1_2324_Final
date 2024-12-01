public class BinaryConverter extends AbstractNumberConverter {
    public BinaryConverter(OriginalNumber originalNumber) {
        super(originalNumber);
        originalNumber.addConverter(this);
    }

    @Override
    public String convert() {
        int decimal = Integer.parseInt(toDecimal());
        return Integer.toBinaryString(decimal);
    }

    @Override
    public void display() {
        System.out.println("Binary: " + convertedNumber);
    }
}
