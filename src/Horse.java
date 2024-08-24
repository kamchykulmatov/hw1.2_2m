public class Horse extends Animals {
    public String wings;

    public Horse(String name, int age, String color, String wings) {
        super(name, age, color);
        this.wings = wings;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    @Override
    public void print() {
        System.out.println("имя " + this.getName());
        System.out.println("возраст "+ this.getAge());
        System.out.println("цвет " + this.getColor());
        System.out.println("крылья " + this.getWings());
    }

}