package ua.lviv.iot.algo.part1.lab3.Camera;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab2.Camera;

import static org.junit.Assert.assertEquals;

public class CameraTest {

    @Test
    public void testTakePhoto() {
        Camera camera = new Camera("Brand", "Model", "Lens") {
            @Override
            public String takePhoto() {
                return "Photo taken with " + brand + " " + model + " " + lens;
            }
        };
        String photo = camera.takePhoto();
        assertEquals("Photo taken with Brand Model Lens", photo);
    }
}
