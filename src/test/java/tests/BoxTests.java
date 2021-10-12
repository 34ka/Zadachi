package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadachi.shape.Ball;
import zadachi.shape.Box;
import zadachi.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class BoxTests {
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

}

