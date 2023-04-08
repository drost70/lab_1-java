package ua.lviv.iot.algo.part1.lab3;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
class FilmSLRCamera extends Camera {
    private String filmType;
    private int filmISO;

    public FilmSLRCamera(String brand, String model, String lens, String filmType, int filmISO) {
        super(brand, model, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }
    
    @Override
    public String takePhoto() {
        return "Photo taken with film SLR camera, film type: " + filmType + ", ISO: " + filmISO;
    }
}
