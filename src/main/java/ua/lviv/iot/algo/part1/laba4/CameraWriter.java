package ua.lviv.iot.algo.part1.lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CameraWriter {
    public String writeToFile(List<Camera> cameras) {
        if (cameras == null || cameras.isEmpty()) {
            return null;
        }
        String defaultFileName = "result.csv";
        FileWriter writer = null;
        try {
            writer = new FileWriter(defaultFileName);
            for (var camera : cameras) {
                writer.write(camera.getHeaders());
                writer.write("\n");
                writer.write(camera.toCSV());
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return defaultFileName;
    }
}
