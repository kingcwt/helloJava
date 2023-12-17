package type;


/**
 * 类的编写——对象的创建和使用
 */
public class index1 {

    public static void main(String[] args) {

        // 无参数
        Person person = new Person();

        // 有参数
        Person person1 = new Person("张三", 20, 1.75);
        person.look();
    }
}


