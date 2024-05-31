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