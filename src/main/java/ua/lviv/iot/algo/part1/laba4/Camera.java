package ua.lviv.iot.algo.part1.lab4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public abstract class Camera {
    protected String brand;
    protected String model;
    protected String lens;

    public Camera(String brand, String model, String lens) {
        this.brand = brand;
        this.model = model;
        this.lens = lens;
    }

    public abstract String takePhoto();

    public String getHeaders() {
        return "brand, model, lens";
    }

    public String toCSV() {
        return brand + ", " + model + ", " + lens;
    }
}
