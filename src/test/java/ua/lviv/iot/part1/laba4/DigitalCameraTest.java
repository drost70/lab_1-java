package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalCameraTest {
    private DigitalCamera digitalCamera;

    @BeforeEach
    public void setUp() {
        digitalCamera = new DigitalCamera("Canon", "EOS 200D", "Canon EF-S 18-55mm");
    }

    @Test
    public void testSavePhoto() {
        digitalCamera.savePhoto(10);
        assertEquals(10, digitalCamera.getPhotosCount());
    }

    @Test
    public void testEraseMemory() {
        digitalCamera.eraseMemory(true);
        assertEquals(0, digitalCamera.getPhotosCount());
    }

    @Test
    public void testChangeSettings() {
        digitalCamera.changeSettings("1920x1080", 2.5);
        assertEquals("1920x1080", digitalCamera.getResolution());
        assertEquals(2.5, digitalCamera.getZoom());
    }

    @Test
    public void testTakePhoto() {
        digitalCamera.setResolution("1280x720");
        digitalCamera.setZoom(1.5);
        assertEquals("Photo taken with digital camera, resolution: 1280x720, zoom: 1.5", digitalCamera.takePhoto());
    }

    @Test
    public void testGetHeaders() {
        assertEquals("brand, model, lens, resolution, zoom, memoryCardType, photosCount", digitalCamera.getHeaders());
    }

    @Test
    public void testToCSV() {
        digitalCamera.setResolution("1920x1080");
        digitalCamera.setZoom(2.0);
        digitalCamera.setMemoryCardType("SD");
        digitalCamera.setPhotosCount(50);
        assertEquals("Canon, EOS 200D, Canon EF-S 18-55mm, 1920x1080, 2.0, SD, 50", digitalCamera.toCSV());
    }
}
