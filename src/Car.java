public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String toString() {
        return " Марка автомобиля: " + brand + ",модель автомобиля: " + model + ",объем двигателя: " + engineVolume + ",цвет кузова: " + color + ",год производства: " + year + ",страна  производства: " + country;
    }
}
