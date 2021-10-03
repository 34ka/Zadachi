package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import zadachi.shape.Cylinder;
import org.junit.jupiter.api.Test;

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
    public void getCyclinderVolumePossitive() {
        Cylinder cylinder = new Cylinder(5, 10);
        double expected = 785;

        Assertions.assertEquals(cylinder.getVolume(), expected, 0.5);
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
    public void getCyclindertoString() {
        Cylinder cylinder = new Cylinder(5, 10);
        String expected = " this is cylinder with radius = 5.0";

        Assertions.assertEquals(cylinder.toString(), expected);
    }

    @Test
    public void testToString() {
    }
}