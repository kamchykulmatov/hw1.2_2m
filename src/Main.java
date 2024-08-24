//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[]{createObject("Cat"), createObject("Dog"), createObject("Horse")};
        Animals[] animals2 = animals;
        int var = animals.length;

        for (int i = 0; i < var; i++) {
            Animals animals1 = animals2[i];
            animals1.print();
        }

    }

    public static Animals createObject(String className) {
        Animals animals = null;
        switch (className) {
            case "Cat":
                animals = new Cat("МУСЯ", 10, "в крапинку", "ЛАСКОВАЯ");
                break;
            case "Dog":
                animals = new Dog("ТУЗИК", 17, "белый", "ПРЕДАННАЯ");
                break;
            case "Horse":
                animals = new Horse("ПЕГАС", 6, "в яблоках", "БЫСТРЫЕ");
                break;
        }
        return animals;
    }
}