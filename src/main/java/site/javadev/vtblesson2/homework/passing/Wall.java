package site.javadev.vtblesson2.homework.passing;


import site.javadev.vtblesson2.homework.actions.Contestant;
import site.javadev.vtblesson2.homework.actions.Obstacle;

public class Wall implements Obstacle {   //Стена

    private final int length;

    public Wall(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.run(length)){
            System.out.println(contestant + " перепрыгнул стену!");
            return true;
        }else {
            System.out.println(contestant + " не смог перепрыгнуть стену...");
            return false;
        }
    }
}