package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import zadachi.shape.Ball;
import zadachi.shape.Cylinder;
import org.junit.jupiter.api.Test;
import zadachi.shape.Pyramid;

public class ShapeTests {

    @Test
    public void getVolume() {
        int a = 2;
        int b = 3;
        int summ = a + b;
        int expected = 5;
        Assertions.assertEquals(summ, expected);
    }
    @Test
    public void getCyclinderVolumePositive() {
        Cylinder cylinder = new Cylinder(5, 10);
        double expected = 785;
        Assertions.assertEquals(cylinder.getVolume(), expected, 1.1);
    }
    @Test
    public void getCyclinderVolumeNegative() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Cylinder cylinder = new Cylinder(5, -10);
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Arguments are not be 0");
    }
    @Test
    public void getCyclinderToString() {
        Cylinder cylinder = new Cylinder(5, 10);
        String expected = " this is cylinder with radius = 5.0";
        Assertions.assertEquals(cylinder.toString(), expected);
    }

    @Test
    public void getBallVolumePositive() {
        Ball ball = new Ball(50);
        double expected = 523598;
        Assertions.assertEquals(ball.getVolume(), expected, 1.1);
    }
    @Test
    public void getBallVolumeNegative() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Ball ball = new Ball(-5);
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Arguments are not be 0");
    }
    @Test
    public void getBallVolumeToString() {
        Ball ball = new Ball(50);
        String expected = " this is ball with radius = 50.0";
        Assertions.assertEquals(ball.toString(), expected);
    }

    @Test
    public void getPyramidVolumePositive() {
        Pyramid pyramid = new Pyramid(50, 25);
        double expected = 416;
        Assertions.assertEquals(pyramid.getVolume(), expected, 1.1);
    }
    @Test
    public void getPyramidVolumeNegative() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Pyramid pyramid = new Pyramid(50, -10);
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Arguments are not be 0");
    }
    @Test
    public void getPyramidVolumeToString() {
        Pyramid pyramid = new Pyramid(50, 25);
        String expected = " this is pyramid with s = 50.0";
        Assertions.assertEquals(pyramid.toString(), expected);
    }
}