public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (this.brand == null || this.brand.isBlank()) {
            this.brand = "Информация не указана";
        }
        this.model = model;
        if (this.model == null || this.model.isBlank()) {
            this.model = "Информация не указана";
        }
        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0) {
            throw new IllegalArgumentException("Информация указана не верно");
        }
        this.color = color;
        if (this.color == null || this.color.isBlank()) {
            this.color = "Информация не указана";
        }
        this.year = year;
        if (this.year <= 0) {
            throw new IllegalArgumentException("Информация указана не верно");
        }
        this.country = country;
        if (this.country == null || this.country.isBlank()) {
            this.country = "Информация не указана";
    }
    }

    public String toString() {
        return " Марка автомобиля: " + brand + ",модель автомобиля: " + model + ",объем двигателя: " + engineVolume + ",цвет кузова: " + color + ",год производства: " + year + ",страна  производства: " + country;
    }
}
