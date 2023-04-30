package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorlessCameraTest {

    private MirrorlessCamera mirrorlessCamera;
    private final String expectedBrand = "Sony";
    private final String expectedModel = "A7III";
    private final String expectedLens = "24-70mm";
    private final int expectedMegapixels = 24;

    @BeforeEach
    public void setUp() {
        mirrorlessCamera = new MirrorlessCamera(expectedBrand, expectedModel, expectedLens, expectedMegapixels);
    }

    @Test
    public void testTakePhoto() {
        String expectedOutput = "Photo taken with mirrorless camera, resolution: " + expectedMegapixels + "MP";
        String actualOutput = mirrorlessCamera.takePhoto();
        Assertions.assertEquals(expectedOutput, actualOutput, "Incorrect takePhoto() output");
    }

    @Test
    public void testGetHeaders() {
        String expectedOutput = "brand,model,lens,megapixels";
        String actualOutput = mirrorlessCamera.getHeaders();
        Assertions.assertEquals(expectedOutput, actualOutput, "Incorrect getHeaders() output");
    }

    @Test
    public void testToCSV() {
        String expectedOutput = expectedBrand + ", " + expectedModel + ", " + expectedLens + "," + expectedMegapixels;
        String actualOutput = mirrorlessCamera.toCSV();
        Assertions.assertEquals(expectedOutput, actualOutput, "Incorrect toCSV() output");
    }
}
