package site.javadev.vtblesson4.work;

public class MainApp {
     public static void main(String[] args) {
         //34:41

         BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3, 4);
         BoxWithNumbers<Float> floatBox = new BoxWithNumbers<>(1.0F, 2.0F, 3.0F, 4.0F);
         //Защита. ЕСЛИ МЫ ПОПЫТАЕМСЯ ЗАДАТЬ В КЛАСС СТРОКУ BoxWithNumbers<String>, то не получится,
         // потому что у нас в BoxWithNumbers наследование N extends Number
         System.out.println(intBox.average());  //выводим среднее значение через функцию .average()BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3, 4);
         System.out.println(floatBox.average());  //выводим среднее значение через функцию .average()

//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//        //....много строк кода типа
//        //intBox1.setObj("Java"); //пробуем записать (положить в коробку) строковое значение
//        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
//
//            int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//            System.out.println("sum " + sum);
//        } else {
//            System.out.println("error");
//        }
//    }
//         GenBox<String> strBox = new GenBox<>("Java"); //мы задали тип для T в GenBox тип
//    // данных String В МОМЕНТ СОЗДАНИЯ объекта. ДЛЯ объекта GenBox тип T стал строкой.
//         GenBox<Integer> intBox = new GenBox<>(10); //мы задали в втором объекте тип для T в GenBox тип
//    // данных Integer В МОМЕНТ СОЗДАНИЯ второго объекта. ДЛЯ объекта GenBox тип T стал
//    // числом в втором объекте.
//         GenBox<Integer> intBox2 = new GenBox<>(20);
//    //intBox.setObl("Java"); ОШИБКА потому что ожидает Integer
//         intBox.setObl(3);
//
//        int sum = intBox.getObl() + intBox2.getObl(); //ТЕПЕРЬ КАСТ НЕ НУЖЕН и
//         // конструктор автоматом ожидает Integer
    }

}
