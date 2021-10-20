package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadachi.shape.*;

import java.util.ArrayList;
import java.util.List;

public class BoxTests {

    @Test
    public void testGetVolume() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        int expected = 5;
        Assertions.assertEquals(sum, expected);
    }

    @Test
    public void testToString() {
        Box box = new Box(2620);
        Assertions.assertTrue(box.toString().contains("This is box with objects = "));
    }

    @Test
    public void testAddFigures() {
        Box box = new Box(2620);
        Ball ball = new Ball(5);
        for (int i = 0; i < 5; i++) {
            boolean result = box.add(ball);
            Assertions.assertTrue(result);
        }
        boolean result = box.add(ball);
        Assertions.assertFalse(result);
    }

    @Test
    public void testGetCapacity() {
        Box box = new Box(1000);
        Assertions.assertEquals(box.getCapacity(), 1000);
    }

    @Test
    public void testClearFigures() {
        Box box = new Box(2620);
        Ball ball = new Ball(5);
        for (int i = 0; i < 3; i++) {
            box.add(ball);
        }
        box.add(ball);
        box.add(ball);
        box.add(ball);
        box.clearFigures();
        Assertions.assertEquals(box.getCapacity(), box.getVolume());
    }

    @Test
    public void testGetFigures() {
        Box box = new Box(2620);
        Ball ball = new Ball(5);
        for (int i = 0; i < 3; i++) {
            box.add(ball);
        }
        List<Shape> expected = new ArrayList<>();
        expected.add(ball);
        expected.add(ball);
        expected.add(ball);
        List<Shape> actual = box.getFigures();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFiguresSize() {
        Box box = new Box(100000);
        Ball ball = new Ball(2);
        for (int i = 0; i < 4; i++) {
            box.add(ball);
        }
        double expected = box.getFigures().size();
        box.removeFigure(ball);

        double actual = box.getFigures().size();

        Assertions.assertEquals(expected - 1, actual);
    }

    @Test
    public void testRemoveWithoutThisFigures() {
        Box box = new Box(100000);
        Ball ball = new Ball(2);
        Cylinder cylinder = new Cylinder(4, 10);

        box.add(ball);
        box.removeFigure(cylinder);

        Assertions.assertTrue(box.getFigures().toString().contains("ball"));
        Assertions.assertFalse(box.getFigures().toString().contains("cylinder"));
    }
}




