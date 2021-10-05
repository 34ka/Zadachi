package zadachi.shape;

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
}