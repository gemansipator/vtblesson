package site.javadev.vtblesson4.work;

public class SimpleBox { // просто коробка в которую можно положить что угодно
    private Object obj;   // создаем obj (произвольное имя) от класса Object и в неё кладем что угодно

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public SimpleBox(Object obj) {
        this.obj = obj;
    }
    public void info(){
        System.out.println(obj.getClass().getSimpleName() + " " + obj);
    }
}
