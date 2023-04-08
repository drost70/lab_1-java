package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab2.Camera;
import ua.lviv.iot.algo.part1.lab2.CameraManager;
import ua.lviv.iot.algo.part1.lab2.FilmSLRCamera;
import ua.lviv.iot.algo.part1.lab2.MirrorlessCamera;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class CameraManagerTest {
    @Test
    public void testAddCamera() {
        CameraManager manager = new CameraManager();
        MirrorlessCamera camera1 = new MirrorlessCamera("Sony", "Alpha a7 III", "Sony FE 24-70mm f/2.8 GM", 24);
        manager.addCamera(camera1);
        assertEquals(manager.findAllWithMegapixelsGreaterThan(0).size(), 1);
    }

    @Test
    public void testFindAllWithMegapixelsGreaterThan() {
        CameraManager manager = new CameraManager();
        MirrorlessCamera camera1 = new MirrorlessCamera("Sony", "Alpha a7 III", "Sony FE 24-70mm f/2.8 GM", 24);
        MirrorlessCamera camera2 = new MirrorlessCamera("Fujifilm", "X-T3", "Fujinon XF 18-55mm f/2.8-4 R LM OIS", 26);
        manager.addCamera(camera1);
        manager.addCamera(camera2);
        List<Camera> highResCameras = manager.findAllWithMegapixelsGreaterThan(25);
        assertEquals(highResCameras.size(), 1);
        assertEquals(highResCameras.get(0), camera2);
    }


    @Test
    public void testFindFilmSLRCamerasWithFilmType() {
        CameraManager manager = new CameraManager();
        FilmSLRCamera camera1 = new FilmSLRCamera("Nikon", "F3HP", "Nikon Series E 50mm f/1.8", "Black and white", 400);
        FilmSLRCamera camera2 = new FilmSLRCamera("Canon", "AE-1 Program", "Canon FD 50mm f/1.8", "Color negative", 200);
        manager.addCamera(camera1);
        manager.addCamera(camera2);
        List<Camera> colorNegFilmCameras = manager.findFilmSLRCamerasWithFilmType("Color negative");
        assertEquals(colorNegFilmCameras.size(), 1);
        assertEquals(colorNegFilmCameras.get(0), camera2);
    }
}
