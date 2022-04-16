package site.javadev.vtblesson1.homework.animals;

public class Tiger extends Cat {
    public static int count;

    public Tiger(String name, int maxRanDistance, int maxSwimDistance) {
        super("Тигр",  name, maxRanDistance, maxSwimDistance);
        count++;
    }
}
