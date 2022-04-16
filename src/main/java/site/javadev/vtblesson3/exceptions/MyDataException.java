package site.javadev.vtblesson3.exceptions;

public class MyDataException extends MyException{
    public MyDataException() {
        super("в матрице найдены некорретные данные");
    }
}
