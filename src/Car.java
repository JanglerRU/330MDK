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
