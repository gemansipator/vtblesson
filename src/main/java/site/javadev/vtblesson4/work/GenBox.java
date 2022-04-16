package site.javadev.vtblesson4.work;
public class GenBox <T>{  //обобщенный класс ("ДЖЕНЕРИК") с переменной T (переменный тип)
    // которая будет тем что мы хотим
    /*Дженерики (обобщения) — это особые средства языка Java для реализации
     обобщённого программирования: особого подхода к описанию данных и алгоритмов,
     позволяющего работать с различными типами данных без изменения их описания.
     одно из назначений — более сильная проверка типов во время компиляции
     и устранение необходимости явного приведения.
     */

    private T obl;   // поле obj типа T

    public T getObl() {
        return obl;
    }

    public void setObl(T obl) {
        this.obl = obl;
    }

    public GenBox(T obl) {
        this.obl = obl;
    }
}

//public class GenBox <T, M>{  //переменных типов может быть НЕСКОЛЬКО. Имена какие угодно.
//    // Обычно заглавная буква  и если тип то T (type) если коллекция то E (element) но не обязательно.
//    // Просто чтобы понятно было стараются
//    // теперь уже ДВА ОБОБЩЕННЫХ ТИПА:
//    private T obl;   // поле obj типа T
//    private M obl2;   // поле obj типа T
//
//    public T getObl() {
//        return obl;
//    }
//
//    public void setObl(T obl, M obl2) {
//        this.obl = obl;
//        this.obl2 = obl2;
//    }
//
//    public GenBox(T obl) {
//        this.obl = obl;
//    }
//}

