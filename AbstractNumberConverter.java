public abstract class AbstractNumberConverter implements NumberConverter {
    protected OriginalNumber originalNumber;
    protected String convertedNumber;

    public AbstractNumberConverter(OriginalNumber originalNumber) {
        this.originalNumber = originalNumber;
    }

    public abstract String convert();  // Phương thức chuyển đổi cụ thể sẽ được cài đặt ở các lớp con.

    public String toDecimal() {
        return Integer.toString(Integer.parseInt(originalNumber.getNumberPresentation(), originalNumber.getRadix()));
    }

    @Override
    public void update() {
        convertedNumber = convert();
        display();
    }
    public String decimalTo(String base) {
        int decimalValue = Integer.parseInt(toDecimal());
        int targetBase = Integer.parseInt(base);
        return Integer.toString(decimalValue, targetBase);
    }
}
