package ua.lviv.iot.algo.part1.lab2;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)

class MirrorlessCamera extends Camera {
    private int megapixels;

    public MirrorlessCamera(String brand, String model, String lens, int megapixels) {
        super(brand, model, lens);
        this.megapixels = megapixels;
    }

    @Override
    public String takePhoto() {
        return "Photo taken with mirrorless camera, resolution: " + megapixels + "MP";
    }
}
