import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.8, "Желтый ", 2015, "Россия","Механическая","Хетчбек","У885НХ79",5,false,new Car.Key());
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","Вариатор","Седан", "А339ВР",5,true,new Car.Key());
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","Автомат","Купе","Р777НБ",4,false,new Car.Key());
        Car car4 = new Car("Kia", "Sportage 4-ого поколения", 2.4, "красный", 2018, "Южная Корея","Вариатор","Внедорожник", "У322АН", 5,false,new Car.Key());
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея","Автомат","Седан","А987НУ",5,false,new Car.Key());
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        car1.changeTires(CURRENT_MONTH);
    }
}