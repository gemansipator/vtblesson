package site.javadev.vtblesson1.homework.animals;

public class Dog extends Animal{
    public static int count;

    public Dog(String name, int maxRanDistance, int maxSwimDistance) {
        super("Пёс", name, maxRanDistance, maxSwimDistance);
        count++;
    }
}
