package zadachi.shape;

import java.util.Objects;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
        if (radius < 0) {
            throw new IllegalArgumentException("Arguments are not be 0");
        }
    }

    @Override
    public double getVolume() {
        return  Math.PI * radius * radius * radius * 4 / 3;
    }

    @Override
    public String toString() {
        return " this is ball with radius = " + radius;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ball)) {
            return false;
        }
        Ball ball = (Ball) o;
        return getVolume() == ball.getVolume() && Objects.equals(toString(), ball.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getVolume());
    }
}