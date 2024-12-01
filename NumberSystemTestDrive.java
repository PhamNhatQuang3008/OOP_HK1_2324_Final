public class NumberSystemTestDrive {
    public static void main(String[] args) {
        OriginalNumber originalNumber = new OriginalNumber("1010", 2); // Binary number 1010

        BinaryConverter binaryConverter = new BinaryConverter(originalNumber);
        HexadecimalConverter hexConverter = new HexadecimalConverter(originalNumber);
        OctalConverter octalConverter = new OctalConverter(originalNumber);

        System.out.println("Original Binary: " + originalNumber.getNumberPresentation());
        originalNumber.notifyConverters();

        originalNumber.setNumberPresentation("1111"); // Change the number to 1111
        System.out.println("Updated Binary: " + originalNumber.getNumberPresentation());
        originalNumber.notifyConverters();
    }
}