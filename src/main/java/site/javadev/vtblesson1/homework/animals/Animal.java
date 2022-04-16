package site.javadev.vtblesson1.homework.animals;

public abstract class Animal {
    public static int count;

    String type;
    String name;
    int maxRanDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRanDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRanDistance = maxRanDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance){
        if (distance <=0 ) {
            System.out.println("Введите для run положительное число");

        }else if (distance <= maxSwimDistance){
            System.out.println(type + " " + name + " успешно пробежал " + distance + " м.");
        } else System.out.println(type + " " + name + " не смог справиться с кроссом");
    }

    public void swim(int distance){
        if (distance <=0 ){
            System.out.println("Введите для swim положительное число");


        }else if(maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            
        } else  if(distance <= maxSwimDistance){
            System.out.println(type + " " + name + " успешно проплыл " + distance + " м.");
        } else {
            System.out.println(type + " "+name+ " не смог справиться с заплывом");
        }

    }

}
