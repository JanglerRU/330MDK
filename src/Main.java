// Класс Машина
class Car {
    private String brand;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Вес: " + weight + ", Водитель: " + driver + ", Мотор: " + engine;
    }
}

// Класс Мотор
class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Мощность: " + power + ", Производитель: " + manufacturer;
    }
}

// Класс Водитель
class Driver {
    private String fullName;
    private int experience;

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Стаж: " + experience + " лет";
    }
}

// Класс Грузовик
class Truck extends Car {
    public Truck(String brand, int weight, Driver driver, Engine engine) {
        super(brand, weight, driver, engine);
    }
}

// Класс Спортивный автомобиль
class SportsCar extends Car {
    public SportsCar(String brand, int weight, Driver driver, Engine engine) {
        super(brand, weight, driver, engine);
    }
}

// Тестирование программы
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Иван Иванов", 5);
        Engine engine = new Engine(400, "Toyota");

        Car car = new Car("Toyota", 1500, driver, engine);
        Truck truck = new Truck("MAN", 7000, driver, engine);
        SportsCar sportsCar = new SportsCar("Ferrari", 1200, driver, engine);

        System.out.println(car);
        car.start();
        car.turnRight();
        car.stop();

        System.out.println(truck);
        truck.start();

        System.out.println(sportsCar);
        sportsCar.turnLeft();
    }
}