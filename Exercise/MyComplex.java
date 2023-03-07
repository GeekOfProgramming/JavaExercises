
public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * @return the real
     */
    public double getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @return the imag
     */
    public double getImag() {
        return imag;
    }

    /**
     * @param imag the imag to set
     */
    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "'" + real + "+" + imag + "i" + "'";
    }

    public boolean isReal() {
        return (real == 0);
    }

    public boolean isImaginary() {
        return (imag == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt((this.real * this.real) + (this.imag * this.imag));
    }

    public double argumet() {
        return Math.atan2(getImag(), getReal());
    }

    public MyComplex add(MyComplex right) {
        this.real = getReal() + right.getReal();
        this.imag = getImag() + right.getImag();

        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex((right.getReal()), right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        this.real = getReal() - right.getReal();
        this.imag = getImag() - right.getImag();
        return this;
    }

    public MyComplex addSubtract(MyComplex right) {
        return new MyComplex((right.getReal()), right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        this.real = getReal() * right.getReal();
        this.imag = getImag() * right.getImag();

        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = getReal() / right.getReal();
        this.imag = getImag() / right.getImag();

        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(getReal(), -getImag());
    }
}