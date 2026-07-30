public class Rational {
    // instance variables
    private int numerator;
    private int denominator;

    // default constructor
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }
    // Second constructor
    public Rational(int  numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    // instance methods
    public void printRational() {
        System.out.printf("%d%n/%n%d%n", this.numerator, this.denominator);
    }

    public String toString(){
        return String.format("%d%n/%n%d%n", this.numerator, this.denominator);
    }

    public void negate() {
        this.numerator = -this.numerator;
    }

    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    public double toDouble() {
        return (double) this.numerator / this.denominator; 
    }
    // Euclidians Algorithm (Greatest Common Divisor)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public Rational reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    public Rational add(Rational that) {
        int adnum = (this.numerator * that.denominator) + (that.numerator * this.denominator);
        int adden = this.denominator * that.denominator;
        Rational rational = new Rational(adnum, adden);
        return rational.reduce(); 
    }
    
    public static void main(String[] args) {
        Rational rational = new Rational(2, 3);
        rational.printRational();
        rational.negate();
        rational.printRational();
        rational.invert();
        rational.printRational();
        System.out.println(rational.toDouble());
        System.out.println(rational.reduce());
        

    }
}
