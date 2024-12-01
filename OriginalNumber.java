import java.util.ArrayList;
import java.util.List;

public class OriginalNumber {
    private String numberPresentation;
    private int radix;
    private List<NumberConverter> converters;

    public OriginalNumber(String numberPresentation, int radix) {
        this.numberPresentation = numberPresentation;
        this.radix = radix;
        converters = new ArrayList<>();
    }

    public void addConverter(NumberConverter converter) {
        converters.add(converter);
    }

    public String getNumberPresentation() {
        return numberPresentation;
    }

    public int getRadix() {
        return radix;
    }

    public void setNumberPresentation(String numberPresentation) {
        this.numberPresentation = numberPresentation;
        notifyConverters();
    }

    public void setRadix(int radix) {
        this.radix = radix;
    }

    public void notifyConverters() {
        for (NumberConverter converter : converters) {
            converter.update();
        }
    }
    private void onStateChanged() {
            notifyConverters();
    }
}
