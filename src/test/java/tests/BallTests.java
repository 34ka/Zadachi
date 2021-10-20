package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import zadachi.shape.Ball;

public class BallTests {

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
}
