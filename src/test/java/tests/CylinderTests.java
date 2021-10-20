package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import zadachi.shape.Cylinder;

public class CylinderTests {

    @Test
    public void getCylinderVolumePositive() {
        Cylinder cylinder = new Cylinder(5, 10);
        double expected = 785;
        Assertions.assertEquals(cylinder.getVolume(), expected, 1.1);
    }

    @Test
    public void getCylinderVolumeNegative() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Cylinder cylinder = new Cylinder(5, -10);
            }
        });
        Assertions.assertEquals(exception.getMessage(), "Arguments are not be 0");
    }

    @Test
    public void getCylinderToString() {
        Cylinder cylinder = new Cylinder(5, 10);
        String expected = " this is cylinder with radius = 5.0";
        Assertions.assertEquals(cylinder.toString(), expected);
    }
}
