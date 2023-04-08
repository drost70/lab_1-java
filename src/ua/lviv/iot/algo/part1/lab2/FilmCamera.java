package ua.lviv.iot.algo.part1.lab2;
import lombok.*;
@Getter
@Setter
@ToString(callSuper=true)
class FilmCamera extends Camera {
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
    }
