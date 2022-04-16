package site.javadev.vtblesson2.homework.creatures;

import site.javadev.vtblesson2.homework.actions.Contestant;

public class Human implements Contestant {
    int maxRunDistance;
    int maxJumpHeight;

    public Human() {
        this.maxRunDistance = 150;
        this.maxJumpHeight = 2;
    }

    @Override
    public boolean run(int distance) {
        if (distance < 0){
            System.out.println(this + " не умеет бегать задом");
            return false;
        }else if (distance > maxRunDistance){
            System.out.println("Дистанция " +distance + " не по плечу" + this);
            return false;
        }else {
            System.out.println(this + " успешно справляется с дистанцией на " + distance+ " метров");
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < 0){
            System.out.println(this + " не умеет закапываться под землю");
            return false;
        }else if (height > maxRunDistance){
            System.out.println("Дистанция " +height + " не по плечу" + this);
            return false;
        }else {
            System.out.println(this + " успешно справляется с прыжком на высоту " + height+ " метров");
            return true;
        }

    }
    @Override
    public String toString(){
        return "Human";
    }
}
