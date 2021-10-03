package zadachi.shape;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
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