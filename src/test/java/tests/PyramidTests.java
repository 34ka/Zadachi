package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import zadachi.shape.Pyramid;

public class PyramidTests {

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
