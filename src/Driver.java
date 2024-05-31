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