package site.javadev.vtblesson2.homework.passing;

import site.javadev.vtblesson2.homework.actions.Contestant;
import site.javadev.vtblesson2.homework.actions.Obstacle;

public class Treadmill implements Obstacle {   //беговая дорожка

    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.run(length)){
            System.out.println(contestant + " пробежал дистанцию!");
            return true;
        }else {
            System.out.println(contestant + " не смог пробежать дистанцию");
        return false;
        }
    }
}
