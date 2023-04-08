package ua.lviv.iot.algo.part1.lab3.DigitalCamera;

import ua.lviv.iot.algo.part1.lab2.DigitalCamera;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class DigitalCameraTest extends DigitalCamera {
    public DigitalCameraTest(String brand, String model, String lens, String resolution, double zoom, String memoryCardType, int photosCount) {
        super(brand, model, lens,resolution,zoom,memoryCardType,photosCount);
    }


    @Test
    void testSavePhoto() {
        DigitalCamera camera = new DigitalCamera("Nikon", "D3500", "18-55mm", "24MP", 3.0, "SD", 0);
        camera.savePhoto(10);
        assertEquals(10, camera.getPhotosCount());
    }

    @Test
    void testEraseMemory() {
        DigitalCamera camera = new DigitalCamera("Nikon", "D3500", "18-55mm", "24MP", 3.0, "SD", 10);
        camera.eraseMemory(true);
        assertEquals(0, camera.getPhotosCount());
    }

    @Test
    void testChangeSettings() {
        DigitalCamera camera = new DigitalCamera("Nikon", "D3500", "18-55mm", "24MP", 3.0, "SD", 10);
        camera.changeSettings("30MP", 5.0);
        assertEquals("30MP", camera.getResolution());
        assertEquals(5.0, camera.getZoom(), 0.001);
    }

    @Test
    void testGetTakePhoto() {
        DigitalCamera camera = new DigitalCamera("Nikon", "D3500", "18-55mm", "24MP", 3.0, "SD", 10);
        assertEquals("Photo taken with digital camera, resolution: 24MP, zoom: 3.0", camera.takePhoto());
    }
}
