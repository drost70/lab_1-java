package ua.lviv.iot.algo.part1.lab4;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class DigitalCamera extends Camera {
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;

    public DigitalCamera(String brand, String model, String lens) {
        super(brand, model, lens);
        this.resolution = resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photosCount = photosCount;
    }


    public void savePhoto(int value) {
        this.photosCount += value;
    }

    public void eraseMemory(boolean memoryCleared) {
        if (memoryCleared) {
            System.out.println("All photos have been erased from memory.");
        } else {
            System.out.println("Failed to erase photos from memory.");
        }
    }

    public void changeSettings(String resolution, double zoom) {
        if (resolution != null && !resolution.isEmpty()) {
            System.out.println("Resolution successfully changed to " + resolution);
            this.resolution = resolution;
        } else {
            System.out.println("Failed to change resolution!");
        }
        if (zoom >= 1 && zoom <= 5) {
            this.zoom = zoom;
            System.out.println("Optical zoom successfully changed to " + zoom);
        } else {
            System.out.println("Failed to change optical zoom!");
        }

    }

    @Override
    public String takePhoto() {
        return "Photo taken with digital camera, resolution: " + resolution + ", zoom: " + zoom;
    }
    @Override
    public String getHeaders() {
        return "brand, model, lens, resolution, zoom, memoryCardType, photosCount";
    }
    @Override
    public String toCSV() {
        return getBrand() + ", " + getModel() + ", " + getLens() + ", " + resolution + ", " + zoom + ", " + memoryCardType + ", " + photosCount;
    }
}
