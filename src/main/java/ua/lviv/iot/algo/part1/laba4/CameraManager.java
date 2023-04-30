package ua.lviv.iot.algo.part1.lab4;

import ua.lviv.iot.algo.part1.lab2.Camera;
import ua.lviv.iot.algo.part1.lab2.FilmCamera;
import ua.lviv.iot.algo.part1.lab2.FilmSLRCamera;
import ua.lviv.iot.algo.part1.lab2.MirrorlessCamera;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CameraManager {
    private final List<ua.lviv.iot.algo.part1.lab2.Camera> cameras = new ArrayList<>();

    public void addCamera(ua.lviv.iot.algo.part1.lab2.Camera camera) {
        cameras.add(camera);
    }

    public List<ua.lviv.iot.algo.part1.lab2.Camera> findAllWithMegapixelsGreaterThan(int megapixels) {
        return cameras.stream()
                .filter(c -> c instanceof ua.lviv.iot.algo.part1.lab2.MirrorlessCamera)
                .map(c -> (ua.lviv.iot.algo.part1.lab2.MirrorlessCamera) c)
                .filter(c -> c.getMegapixels() > megapixels)
                .collect(Collectors.toList());
    }

    public List<ua.lviv.iot.algo.part1.lab2.Camera> findFilmSLRCamerasWithFilmType(String filmType) {
        return cameras.stream()
                .filter(c -> c instanceof ua.lviv.iot.algo.part1.lab2.FilmSLRCamera)
                .map(c -> (ua.lviv.iot.algo.part1.lab2.FilmSLRCamera) c)
                .filter(c -> c.getFilmType().equals(filmType))
                .collect(Collectors.toList());
    }

    public void printAllCameras() {
        for (ua.lviv.iot.algo.part1.lab2.Camera camera : cameras) {
            System.out.println(camera);
        }
    }
