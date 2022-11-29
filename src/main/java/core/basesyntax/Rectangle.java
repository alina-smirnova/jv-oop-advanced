package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawing {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public double getA() {
        return sideA * sideB;
    }

    public void setA(double sideA) {
        this.sideA = sideA;
    }

    public double getB() {
        return sideB;
    }

    public void setB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rectangle: square, area: "
                + getArea()
                + " sq.units, color: "
                + color;
    }
}
