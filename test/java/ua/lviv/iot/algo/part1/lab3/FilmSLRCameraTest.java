package ua.lviv.iot.algo.part1.lab3.FilmSLRCamera;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab2.FilmSLRCamera;

import static org.junit.Assert.assertEquals;

class FilmSLRCameraTest extends FilmSLRCamera {

    public FilmSLRCameraTest(String brand, String model, String lens, String filmType, int filmISO) {
        super(brand, model, lens, filmType, filmISO);
    }
    @Test
    public void testGetTakePhoto() {
        FilmSLRCamera camera = new FilmSLRCamera("Canon", "EOS Rebel T7", "EF-S 18-55mm", "Color film", 400);
        assertEquals("Photo taken with film SLR camera, film type: Color film, ISO: 400", camera.takePhoto());
    }

    @Test
    public void testGetFilmType() {
        FilmSLRCamera camera = new FilmSLRCamera("Canon", "EOS Rebel T7", "EF-S 18-55mm", "Black and white film", 200);
        assertEquals("Black and white film", camera.getFilmType());
    }

    @Test
    public void testGetFilmISO() {
        FilmSLRCamera camera = new FilmSLRCamera("Nikon", "FM2", "Nikkor 50mm f/1.8", "Color film", 800);
        assertEquals(800, camera.getFilmISO());
    }

}
