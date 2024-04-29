public class Q2a {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,3);
        Complex c2 = new Complex(4,-1);
        c1.display();
        c2.display();
        Complex c3 = c1.add(c1,c2);
        c3.display();
    }
}
class Complex{
    int real;
    int imag;
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    void display(){
        System.out.println(real + ((imag>=0)?"+":"") + imag + "i");
    }
    public Complex add(Complex a,Complex b){
        return new Complex(a.real + b.real , a.imag + b.imag);
    }
}
