# helloJava



### 类的定义

> 一个文件目录为一个package ,一个文件下只定义一个公共的类，可以有多个非公共类  

### 构造器可以使用重载的方式来初始化不同的参数

> 构造器的方法名必须和类名一致

```java

// file: index1
public class index1 {

    public static void main(String[] args) {

        // 无参数
        Person person = new Person();

        // 有参数
        Person person1 = new Person("张三", 20, 1.75);
        person.look();
    }
}

// file: Person
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
    
    // ...other code
}
```