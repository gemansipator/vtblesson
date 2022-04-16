package site.javadev.vtblesson1.homework.animals;

public abstract class Cat extends Animal{
    public static int count;

    public Cat(String type, String name, int maxRanDistance, int maxSwimDistance) {
        super(type, name, maxRanDistance, maxSwimDistance);
    }
}
