package zadachi.shape;

import java.util.Objects;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("Arguments are not be 0");
        }
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return " this is cylinder with radius = " + radius;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cylinder)) {
            return false;
        }
        Cylinder cylinder = (Cylinder) o;
        return getVolume() == cylinder.getVolume() && Objects.equals(toString(), cylinder.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getVolume());
    }
}
