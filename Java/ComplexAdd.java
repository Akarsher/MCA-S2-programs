class Complex {
    private double real;
    private double img;

    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImg = this.img + other.img;
        return new Complex(newReal, newImg);
    }

    void display() {
        System.out.println(real + " + " + img + "i");
    }
}

class ComplexAdd {
    public static void main(String args[]) {

        Complex num1 = new Complex(3.4, 2.5);
        Complex num2 = new Complex(1.6, 4.1);
        System.out.print("Complex Number 1: ");
        num1.display();
        System.out.print("Complex Number 2: ");
        num2.display();

        Complex sum = num1.add(num2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}

