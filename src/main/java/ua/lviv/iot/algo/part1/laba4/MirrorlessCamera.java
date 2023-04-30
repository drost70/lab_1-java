package ua.lviv.iot.algo.part1.lab4;

import lombok.*;
import ua.lviv.iot.algo.part1.lab2.Camera;

@Getter
@Setter
@ToString(callSuper = true)
public class MirrorlessCamera extends Camera {
    private int megapixels;

    public MirrorlessCamera(String brand, String model, String lens, int megapixels) {
        super(brand, model, lens);
        this.megapixels = megapixels;
    }

    @Override
    public String takePhoto() {
        
        return "Photo taken with mirrorless camera, resolution: " + megapixels + "MP";
    }
    @Override
    public String getHeaders()
    {
        return "brand,model,lens,megapixels";
    }
    @Override
    public String toCSV() {
        
        return super.toCSV() + "," + megapixels;
    }
}
