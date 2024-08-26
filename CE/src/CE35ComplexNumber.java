public class CE35ComplexNumber {
    private double real;
    private double imaginary;

    public CE35ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(CE35ComplexNumber other) {
        real += other.real;
        imaginary += other.imaginary;
    }

    public void add(double otherReal, double otherImaginary) {
        real += otherReal;
        imaginary += otherImaginary;
    }

    public void subtract(CE35ComplexNumber other) {
        real -= other.real;
        imaginary -= other.imaginary;
    }

    public void subtract(double otherReal, double otherImaginary) {
        real -= otherReal;
        imaginary -= otherImaginary;
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}