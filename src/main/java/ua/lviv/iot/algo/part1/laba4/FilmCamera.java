package ua.lviv.iot.algo.part1.lab4;

import lombok.*;
@Getter
@Setter
@ToString(callSuper=true)
public class FilmCamera extends Camera {
    private String filmType;
    private int filmISO;

    public FilmCamera(String brand, String model, String lens, String filmType, int filmISO) {
        super(brand, model, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }

    @Override
    public String takePhoto() {

        return "Photo taken with film camera, film type: " + filmType + ", ISO: " + filmISO;
    }
    @Override
    public String getHeaders() {

        return super.getHeaders() + ",filmType,filmISO";
    }
    @Override
    public String toCSV() {

        return super.toCSV() + "," + filmType + "," + filmISO;
    }
}
