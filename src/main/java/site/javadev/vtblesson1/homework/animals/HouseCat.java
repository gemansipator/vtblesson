package site.javadev.vtblesson1.homework.animals;

public class HouseCat extends Cat{
    public static int count;

    public HouseCat(String name, int maxRanDistance) {
        super("Домашний кот", name, maxRanDistance, 0);
    }
}
