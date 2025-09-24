package EndSem.Q1;


class Complex{
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }
    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + "+" + imaginary + "i";
    }
}
class ComplexNumberFormatException extends Exception{
    public ComplexNumberFormatException(String message){
        super(message);
    }
}
public class ComplexApp {
    public static Complex add(Complex a,Complex b) throws ComplexNumberFormatException {
        if(a == null || b == null){
            throw new ComplexNumberFormatException("No number");
        }
        int real = a.getReal() + b.getReal();
        int imaginary = a.getImaginary() + b.getImaginary();
        return new Complex(real,imaginary);
    }
    public static void main(String[] args) {
        try {
            Complex a = new Complex(2,5);
            Complex b = new Complex(1,4);
            Complex sum = add(a,b);
            System.out.println(sum);
        }catch (ComplexNumberFormatException e){
            e.getMessage();
        }
    }
}
