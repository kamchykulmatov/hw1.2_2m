public class Cat extends Animals{

    public String cute;

    public Cat(String name, int age, String color,String cute) {
        super(name, age, color);
        this.cute=cute;
    }

    public String getCute() {
        return cute;
    }

    public void setCute(String cute) {
        this.cute = cute;
    }

    @Override
    public void print() {
        System.out.println("имя " + this.getName());
        System.out.println("возраст "+ this.getAge());
        System.out.println("цвет " + this.getColor());
        System.out.println("милота " + this.getCute());
    }

}
