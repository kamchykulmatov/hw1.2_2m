public class Dog extends Animals {
    public String friendly;

    public Dog(String name, int age, String color, String friendly) {
        super(name, age, color);
        this.friendly = friendly;
    }

    public String getFriendly() {
        return friendly;
    }

    public void setFriendly(String friendly) {
        this.friendly = friendly;
    }

    @Override
    public void print() {
        System.out.println("имя " + this.getName());
        System.out.println("возраст "+ this.getAge());
        System.out.println("цвет " + this.getColor());
        System.out.println("дружелюбность " + this.getFriendly());
    }

}
