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