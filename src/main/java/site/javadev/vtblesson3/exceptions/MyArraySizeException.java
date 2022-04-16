package site.javadev.vtblesson3.exceptions;

public class MyArraySizeException extends MyException{
    public MyArraySizeException() {
        super("Размер входного масива не 4x4");
    }
}
