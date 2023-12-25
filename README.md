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

### 封装的思想
- 高内聚：类的内部数据操作细节自己完成，不允许外部干涉；
- 低耦合：仅对外暴露少量的方法用于使用
> 隐藏对象内部的复杂性，只对外公开简单的接口，便于外界调用，从而提高系统的可扩展性，可维护性，提高程序的安全性。


### 重载和重写的区别
- 重载：在同一个类中，当方法名相同，形参列表不同的时候，多个方法构成了重载
- 重写：在不同的类中，子类对父类提供的方法不满意，对父类的方法进行重写  

### 多态

> 多种形态，具体去完成某个行为，当不同的对象去完成时会产生不同的状态，同一行为，不同的子类呈现出来的状态是不同的。
> 多态跟属性无关，多态指方法的多态，而不是属性的多态 【demo3】
> 多态三要素 继承，重写，父类引用指向子类对象
> 多态的好处：提高代码扩展性

### 网络通信协议的分层
- 名义上标准：ISO/OSI参考模型
- 事实上标准：TCP/IP协议栈（Internet使用的协议）

`TCP/IP协议`
> 应用层，`传输层【udp,tcp】`，网络层[ip]，物理，数据链路层

`ISO参考模型`
> 应用层，表示层，会话层，传输层，网络层，数据链路层，物理层



### mysql
- 查看数据库
```mysql
show databases;
```
- 创建表
```mysql
create table t_book(id int(11),name varchar(255),author varchar(255),price double);
```

- 查询表字段
```mysql
desc t_book;
```
- 查询所有数据
```mysql
select * from t_book;
# 查看部分
select name,author from b_book;
```

- 给表增加数据
```mysql
insert into t_book (id,name,author,price) values (1,'a','chr',10.0);
```
- 删除表中某一条数据
```mysql
delete from t_book where id=1;
```

- 修改表中某一条数据
```mysql
update t_book set price=36.6 where id=1;
```

