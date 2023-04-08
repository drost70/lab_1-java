package ua.lviv.iot.algo.part1.lab2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CameraManager {
    private final List<Camera> cameras = new ArrayList<>();

    public void addCamera(Camera camera) {
        cameras.add(camera);
    }

    public List<Camera> findAllWithMegapixelsGreaterThan(int megapixels) {
        return cameras.stream()
                .filter(c -> c instanceof MirrorlessCamera)
                .map(c -> (MirrorlessCamera) c)
                .filter(c -> c.getMegapixels() > megapixels)
                .collect(Collectors.toList());
    }

    public List<Camera> findFilmSLRCamerasWithFilmType(String filmType) {
        return cameras.stream()
                .filter(c -> c instanceof FilmSLRCamera)
                .map(c -> (FilmSLRCamera) c)
                .filter(c -> c.getFilmType().equals(filmType))
                .collect(Collectors.toList());
    }

    public void printAllCameras() {
        for (Camera camera : cameras) {
            System.out.println(camera);
        }
    }

    public static void main(String[] args) {
        CameraManager manager = new CameraManager();

        MirrorlessCamera camera1 = new MirrorlessCamera("Sony", "Alpha a7 III", "Sony FE 24-70mm f/2.8 GM", 24);
        manager.addCamera(camera1);

        FilmCamera camera2 = new FilmCamera("Canon", "EOS 650", "Canon FD 50mm f/1.8", "Color negative", 200);
        manager.addCamera(camera2);

        MirrorlessCamera camera3 = new MirrorlessCamera("Fujifilm", "X-T3", "Fujinon XF 18-55mm f/2.8-4 R LM OIS", 26);
        manager.addCamera(camera3);

        FilmSLRCamera camera4 = new FilmSLRCamera("Nikon", "F3HP", "Nikon Series E 50mm f/1.8", "Black and white", 400);
        manager.addCamera(camera4);

        manager.printAllCameras();

        System.out.println("Cameras with more than 25 megapixels:");
        List<Camera> highResCameras = manager.findAllWithMegapixelsGreaterThan(25);
        for (Camera camera : highResCameras) {
            System.out.println(camera);
        }

        System.out.println("Film SLR cameras with color negative film:");
        List<Camera> colorNegFilmCameras = manager.findFilmSLRCamerasWithFilmType("Color negative");
        for (Camera camera : colorNegFilmCameras) {
            System.out.println(camera);
        }
    }
}
