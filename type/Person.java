package type;

public class Person {
    String name;
    int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

        System.out.println("构造函数");
    }

    public Person() {
        System.out.println("无参构造函数");
    }


    public void look() {
        System.out.println("name:" + name + "--age:" + age + "---height:" + height);
    }

    public void study() {
        System.out.println("学习中");
    }
}


class add {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}