package demo12;

public class Student  extends Person{

    @Override
    public void eat() {
        System.out.println("对父类方法重写");
    }
}
