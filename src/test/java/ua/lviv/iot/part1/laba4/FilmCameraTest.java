package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmCameraTest {
    private FilmCamera filmCamera;

    @BeforeEach
    public void setUp() {
        filmCamera = new FilmCamera("Canon", "AE-1", "50mm", "35mm", 400);
    }

    @Test
    public void testTakePhoto() {
        String expected = "Photo taken with film camera, film type: 35mm, ISO: 400";
        String actual = filmCamera.takePhoto();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetHeaders() {
        String expected = "brand, model, lens,filmType,filmISO";
        String actual = filmCamera.getHeaders();
        assertEquals(expected, actual);
    }

    @Test
    public void testToCSV() {
        String expected = "Canon, AE-1, 50mm,35mm,400";
        String actual = filmCamera.toCSV();
        assertEquals(expected, actual);
    }
}
