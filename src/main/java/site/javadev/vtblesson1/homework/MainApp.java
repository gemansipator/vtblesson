package site.javadev.vtblesson1.homework;

import site.javadev.vtblesson1.homework.animals.Animal;
import site.javadev.vtblesson1.homework.animals.Dog;
import site.javadev.vtblesson1.homework.animals.HouseCat;
import site.javadev.vtblesson1.homework.animals.Tiger;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new HouseCat("Барсик", 200),
                new Dog("Бобик", 1000, 50),
                new Tiger("Тархан", 10000, 500)

        };
        for (Animal o: animals){
            o.run(800);
            o.swim(40);
        }
        System.out.println("Всего участвовало в кроссе животных: " + Animal.count);

    }
}
/*
Практическое задание
1. Создать классы Собака, Домашний Кот, Тигр, Животное (можете добавить два-три своих
класса).
2. Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина
препятствия.
3. У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м;
плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет
печать в консоль. Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
4. Создать один массив с животными и заставляете их по очереди пробежать дистанцию и
проплыть.
5. * Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных. */
