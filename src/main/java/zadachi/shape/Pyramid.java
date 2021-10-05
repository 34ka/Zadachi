package zadachi.shape;


public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        if (s < 0 || h < 0) {
            throw new IllegalArgumentException("Arguments are not be 0");
        }
    }

    @Override
    public double getVolume() {
        return s * h * 1 / 3;
    }

    @Override
    public String toString() {
        return " this is pyramid with s = " + s;
    }
}
