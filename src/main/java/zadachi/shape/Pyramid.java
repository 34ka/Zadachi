package zadachi.shape;


class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
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
