package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@NoArgsConstructor
@ToString


abstract class Camera {
    protected String brand;
    protected String model;
    protected String lens;

    public Camera(String brand, String model, String lens) {
        this.brand = brand;
        this.model = model;
        this.lens = lens;
    }

    public abstract String takePhoto();
}
