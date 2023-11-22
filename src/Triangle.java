public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a != b && b != c && c != a)
            throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double calculateSquare() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public boolean isExists() {
        return (a + b) > c && (b + c) > a && (c + a) > b;
    }

    @Override
    public String toString() {
        return "Triangle(" + a + ", " + b + ", " + c + ")";
    }

    public boolean equals(Triangle other) {
        return (a == other.a && b == other.b && c == other.c)
                || (a == other.b && b == other.c && c == other.a)
                || (a == other.c && b == other.a && c == other.b);
    }
}
