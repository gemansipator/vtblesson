package site.javadev.vtblesson4.work;

public class BoxWithNumbers<N extends Number>{      //создаем  коробку с числами и
    // наследуем (ограничиваем) от Number  - там могут быть и инты и дабл и др числовые
    // и ТЕПЕРЬ МЫ МОЖЕМ ИСПОЛЬЗОВАТЬ МЕТОДЫ ИЗ Number
    private N[] array;

    public BoxWithNumbers(N... array) {  //если вместо N[] массива интов мы пишем
        // N... то это значит ЛЮБОЕ КОЛИЧЕСТВО ИНТОВ
        this.array = array;
    }

    //допустим сделаем вычисление среднего значения:
    public double average(){
        double avg = 0.0;
        // проходим по элементам массива
        for (int i = 0; i < array.length; i++) {
            // к среднему значению прибавить значение массива в этой ячейке
            avg += array[i].doubleValue();
        }
        return avg /= array.length;   //поделить на длину массива
    }
}
