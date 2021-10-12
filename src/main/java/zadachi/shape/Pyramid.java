package zadachi.shape;


import java.util.Objects;

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

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pyramid)) {
            return false;
        }
        Pyramid pyramid = (Pyramid) o;
        return getVolume() == pyramid.getVolume() && Objects.equals(toString(), pyramid.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getVolume());
    }
}
