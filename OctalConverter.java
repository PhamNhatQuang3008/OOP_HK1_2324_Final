public class OctalConverter extends AbstractNumberConverter {
    public OctalConverter(OriginalNumber originalNumber) {
        super(originalNumber);
        originalNumber.addConverter(this);
    }

    @Override
    public String convert() {
        int decimal = Integer.parseInt(toDecimal());
        return Integer.toOctalString(decimal);
    }

    @Override
    public void display() {
        System.out.println("Octal: " + convertedNumber);
    }
}
