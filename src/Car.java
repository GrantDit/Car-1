import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String bodyType;
    private final int places;
    private final Key key;
    String color;
    String transmission;
    String carNumber;
    private double engineVolume;
    private boolean tires;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String carNumber, int places, boolean tires, Key key) {
        this.brand = brand;
        if (this.brand == null || this.brand.isBlank()) {
            brand = "Информация не указана";
        }
        this.model = model;
        if (model == null || this.model.isBlank()) {
            model = "Информация не указана";
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
            throw new IllegalArgumentException("Информация не указана");
        }
        this.country = country;
        if (this.country == null || this.country.isBlank()) {
            country = "Информация не указана";
        }
        this.transmission = transmission;
        if (this.transmission == null || this.transmission.isEmpty() || this.transmission.isBlank()) {
            this.transmission = "Информация не указана";
        }
        this.bodyType = bodyType;
        if (this.bodyType == null || this.bodyType.isEmpty() || this.bodyType.isBlank()) {
            bodyType = "Информация не указана";
        }
        this.carNumber = carNumber;
        if (this.carNumber == null || this.carNumber.isEmpty() || this.carNumber.isBlank()) {
            this.carNumber = "Информация не указана";
        }
        this.places = places;
        if (this.places <= 0) {
            throw new IllegalArgumentException("Информация не указана");
        }
        this.tires = tires;

        this.key = new Key(key.remoteStartEngine, key.keylessAccess);
    }

    //public Car(String brand, String model, int year, String country, double engineVolume, String color) {
    // this(brand, model, year, country,1.4,color, "механика", "седан", "x000xx000",5,true,new Key());
    //}

    public Key getKey() {
        return key;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    // не изменяемые;
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPlaces() {
        return places;
    }

    //изменяемые параметры;
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void changeTires(int currentMonth) {
        this.tires = currentMonth >= 11 || currentMonth <= 4;
    }

    public String toString() {

        return " Марка автомобиля: " + brand + ",модель автомобиля: " + model + ",объем двигателя: " + engineVolume + ",цвет кузова: " + color + ",год производства: " + year + ",страна производства: " + country + ", коробка передач: " + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + carNumber + ", количество мест: " + places + ", " +
                (isTires() ? " зимняя резина" : " летняя резина, ") + (getKey().isKeylessAccess() ? "Бесключевой доступ" : "доступ с ключем ") +", "+ (getKey().isRemoteStartEngine() ? "Дистанционный запуск" : "Класический запуск.");
    }

    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return remoteStartEngine == key.remoteStartEngine && keylessAccess == key.keylessAccess;
        }

        @Override
        public int hashCode() {
            return Objects.hash(remoteStartEngine, keylessAccess);
        }
    }
}
