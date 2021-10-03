package zadachi.shape;

abstract class SolidOfRevolution extends Shape {
    protected double radius;//Access modifier Protected. Видимость = видимости Default + Видимость для классов детей этого protected класса. Дети могут быть в этом пакете и в других.

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }
}
