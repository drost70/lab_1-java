package ua.lviv.iot.algo.part1.lab3.FilmCamera;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.lviv.iot.algo.part1.lab2.FilmCamera;

import java.util.List;
public class FilmCameraTest extends FilmCamera  {
    public FilmCameraTest(String brand, String model, String lens, String filmType, int filmISO) {
        super(brand, model, lens, filmType, filmISO);
    }

    @Test
    public void testGetTakePhoto() {
        FilmCamera camera = new FilmCamera("Brand", "Model", "Lens", "Type", 100);
        String expected = "Photo taken with film camera, film type: Type, ISO: 100";
        String actual = camera.takePhoto();
        Assert.assertEquals(expected, actual);
    }
}
